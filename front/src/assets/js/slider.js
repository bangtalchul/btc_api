let sliderContainer = document.getElementById("sliderContainer");
let slider = document.getElementById("slider");
let cards = slider.getElementsByTagName("li");

let sliderContainerWidth = sliderContainer.clientWidth;
let elementToShow = 4;

let cardWidth = sliderContainerWidth / elementToShow;

slider.style.width = cards.length * cardWidth + "px";

for (let index = 0; index < cards.length; index++) {
  const element = cards[index];
  element.style.width = cardwidth + "px";
}

function prev() {
  slider.style.marginLeft =
    +slider.style.marginLeft.slice(0, -2) - cardWidth + "px";
}

function next() {
  slider.style.marginLeft =
    +slider.style.marginLeft.slice(0, -2) + cardWidth + "px";
}

document.getElementById("prev").addEventListener("click", () => {
  alert("ser");
  prev();
});

document.getElementById("next").addEventListener("click", () => {
  next();
});
