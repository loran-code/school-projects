//  Experimenteer met de volgende methodes van Document Object Model:
//  getElementById, createElement en addEventListener.

function insert(num) {
  document.form.textview.value = document.form.textview.value + num;
}

function equal(num) {
  var exp = document.form.textview.value;
  if (exp) {
    document.form.textview.value = eval(exp);
  }
}

function reset() {
  document.form.textview.value = "";
}

function back() {
  var exp = document.form.textview.value;
  document.form.textview.value = exp.substring(0, exp.length - 1);
}
