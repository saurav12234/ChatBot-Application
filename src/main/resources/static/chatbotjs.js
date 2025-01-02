
<script>
    async function sendMessage() {
        const userInput = document.getElementById("userInput").value;
        if (userInput.trim() === "") return;

        // Add user message to the chat window
        const chatWindow = document.getElementById("chatWindow");
        chatWindow.innerHTML += `<p>User: ${userInput}</p>`;

        // Send the message to the backend
        const response = await fetch("http://localhost:8080/chatbot/message" {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(userInput),
        });

        const botMessage = await response.text();
        chatWindow.innerHTML += `<p>Bot: ${botMessage}</p>`;
    }
</script>