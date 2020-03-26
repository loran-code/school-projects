function printTime() {
  var d = new Date();
  var year = d.getFullYear();
  var month = d.getMonth();
  var day = d.getDate();
  var hours = d.getHours();
  var mins = d.getMinutes();
  var secs = d.getSeconds();
  document.getElementById("date").innerHTML =
    "Current date: " + day + "/" + (month + 1) + "/" + year;
  document.getElementById("time").innerHTML =
    "Current time: " + hours + ":" + mins + ":" + secs;
}
setInterval(printTime, 1000);

// game randomnizer function from Gamepicker.html
function randomnizer() {
  var game = document.getElementById("gameNumber");
  game.innerHTML =
    " The game that you will play is game #" +
    Math.floor(Math.random() * 5 + 1);
}
