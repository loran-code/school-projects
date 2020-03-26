alert(
  " -                                      Spam Spam Spam Spam                                      - \n\n\n The following content on this page might be considerd spammy and strange.\n viewer discretion advised.\n\n\n -                                      Spam Spam Spam Spam                                      -"
);

// date and time function //
function printTime() {
  var d = new Date();
  var year = d.getFullYear();
  var month = d.getMonth();
  var day = d.getDate();
  var hours = d.getHours();
  var mins = d.getMinutes();
  var secs = d.getSeconds();
  document.body.div.main.innerHTML =
    "Current date and time is: " +
    day +
    "/" +
    month +
    "/" +
    year +
    " " +
    hours +
    ":" +
    mins +
    ":" +
    secs;
}
setInterval(printTime, 1000);
