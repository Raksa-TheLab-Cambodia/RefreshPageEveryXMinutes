<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer List</title>
</head>
<body>
<h1>Customer List</h1>
<ul id="customer-list">
    <!-- Customer data will be dynamically inserted here -->
</ul>

<script>
    // Function to fetch customer data from the backend
    function fetchCustomers() {
        fetch('/api/customers')  // API call to your Spring Boot backend
            .then(response => response.json())
            .then(data => {
                // Select the customer list element
                const customerList = document.getElementById('customer-list');
                // Clear existing content
                customerList.innerHTML = '';
                // Append new data
                data.forEach(customer => {
                    const li = document.createElement('li');
                    li.textContent = 'ID: ' + customer.id + ' ,Name: ' + customer.name + ' ,Email: ' + customer.email;
                    customerList.appendChild(li);
                });
            })
            .catch(error => console.error('Error fetching customers:', error));
    }

    // Call fetchCustomers every 1 minute
    setInterval(fetchCustomers, 60 * 1000);

    // Initial fetch when the page loads
    fetchCustomers();
</script>
</body>
</html>
