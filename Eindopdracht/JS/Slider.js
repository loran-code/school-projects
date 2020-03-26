var images = [
  "https://i.picsum.photos/id/1002/4312/2868.jpg",
  "https://i.picsum.photos/id/103/2592/1936.jpg",
  "https://i.picsum.photos/id/1024/1920/1280.jpg"
];
var num = 0;
function next() {
  var slider = document.getElementById("slider");
  num++;
  if (num >= images.length) {
    num = 0;
  }
  slider.src = images[num];
}
function prev() {
  var slider = document.getElementById("slider");
  num--;
  if (num < 0) {
    num = images.length - 1;
  }
  slider.src = images[num];
}

var canvas = document.getElementById("canvas");
var ctx = canvas.getContext("2d");
ctx.font = "30px Comic Sans MS";
ctx.fillStyle = "orange";
ctx.textAlign = "center";
ctx.fillText("Hello Novi", canvas.width / 2, canvas.height / 2);
