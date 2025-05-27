document.getElementById("registerBtn").onclick = () => {
  alert("You have registered!");
};

document.getElementById("categoryFilter").onchange = (e) => {
  console.log("Filtering by:", e.target.value);
};

document.getElementById("searchInput").addEventListener("keydown", (e) => {
  console.log("Searching:", e.key);
});
