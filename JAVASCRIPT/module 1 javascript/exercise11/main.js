document.getElementById("regForm").onsubmit = function (e) {
  e.preventDefault();
  const { name, email, event: selectedEvent } = e.target.elements;
  if (!name.value || !email.value) {
    alert("Please fill all fields");
    return;
  }
  console.log("Registered for", selectedEvent.value);
};
