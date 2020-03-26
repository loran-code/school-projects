$(function() {
  // Dashed border
  $("#button1").click(function() {
    $("#header").toggleClass("border");
  });
  // change font
  $("#button2").click(function() {
    $("#sidebar").toggleClass("fontchange");
  });
  // RDY
  $("#button3").click(function() {
    $("#content-1").html("READY?");
    $("#content-1").toggleClass("rdysetgo");
  });
  // SET
  $("#button4").click(function() {
    $("#content-2").html("SET");
    $("#content-2").toggleClass("rdysetgo");
  });
  // GO
  $("#button5").click(function() {
    $("#content-3").html("GO!");
    $("#content-3").toggleClass("rdysetgo");
  });
  // Nightmode
  $("#button6").click(function() {
    $("html").toggleClass("nightmode");
    $("body").toggleClass("nightmode");
  });
});
