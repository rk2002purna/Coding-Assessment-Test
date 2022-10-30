const glide1 = document.getElementById("glide1");

if (glide1)
  new Glide(glide1, {
    type: "carousel",
    startAt: 0,
    perView: 5,
    hoverpause: false,
    autoplay: 2000,
    animationDuration: 800,
    animationTimingFunc: "cubic-bezier(0.165, 0.840, 0.440, 1.000)",
    breakpoints: {
      1200: {
        perView: 3,
      },
      768: {
        perView: 2,
      },
    },
  }).mount();

  window.addEventListener("load", () => {
    const loader = document.getElementById("pre-loader");
    setTimeout(() => {
      loader.classList.add("hide");
    }, 2000);
  });

  // PopUp
const popup = document.querySelector(".popup");
const closePopup = document.querySelector(".popup-close");

closePopup.addEventListener("click", () => {
  popup.classList.remove("show");
});

window.addEventListener("load", () => {
  setTimeout(() => {
    popup.classList.add("show");
  }, 5000);
});

(function() {
   
  $(".form-control").on('focus', function(){

      $(this).parents(".form-group").addClass('focused');

  });

  $(".form-control").on('blur', function(){

      $(this).parents(".form-group").removeClass('focused');

  });

});