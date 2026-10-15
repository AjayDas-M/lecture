// Ajay Das M. portfolio interactions
const root = document.documentElement;
const themeToggle = document.getElementById("themeToggle");
const themeIcon = document.getElementById("themeIcon");
const menuToggle = document.getElementById("menuToggle");
const siteNav = document.getElementById("siteNav");

// Theme preference is stored locally in the browser.
const savedTheme = localStorage.getItem("ajay-portfolio-theme");
if (savedTheme === "dark" || savedTheme === "light") {
  root.dataset.theme = savedTheme;
}
updateThemeButton();

themeToggle.addEventListener("click", () => {
  root.dataset.theme = root.dataset.theme === "dark" ? "light" : "dark";
  localStorage.setItem("ajay-portfolio-theme", root.dataset.theme);
  updateThemeButton();
});

function updateThemeButton() {
  const isDark = root.dataset.theme === "dark";
  themeIcon.textContent = isDark ? "☀" : "☾";
  themeToggle.setAttribute("aria-label", isDark ? "Switch to light theme" : "Switch to dark theme");
  themeToggle.title = isDark ? "Switch to light theme" : "Switch to dark theme";
}

// Mobile navigation
menuToggle.addEventListener("click", () => {
  const isOpen = siteNav.classList.toggle("is-open");
  menuToggle.setAttribute("aria-expanded", String(isOpen));
  menuToggle.setAttribute("aria-label", isOpen ? "Close navigation" : "Open navigation");
});

siteNav.querySelectorAll("a").forEach((link) => {
  link.addEventListener("click", () => {
    siteNav.classList.remove("is-open");
    menuToggle.setAttribute("aria-expanded", "false");
    menuToggle.setAttribute("aria-label", "Open navigation");
  });
});

// Achievement image lightbox. It opens only when a real image has loaded.
const lightbox = document.getElementById("lightbox");
const lightboxImage = document.getElementById("lightboxImage");
const lightboxCaption = document.getElementById("lightboxCaption");
const lightboxClose = document.getElementById("lightboxClose");

document.querySelectorAll("[data-lightbox]").forEach((card) => {
  card.addEventListener("click", () => {
    const image = card.querySelector("img");
    if (!image || image.style.display === "none" || !image.complete || image.naturalWidth === 0) {
      return;
    }
    lightboxImage.src = image.src;
    lightboxImage.alt = image.alt;
    lightboxCaption.textContent = card.dataset.caption || image.alt;
    lightbox.showModal();
  });
});

lightboxClose.addEventListener("click", () => lightbox.close());
lightbox.addEventListener("click", (event) => {
  if (event.target === lightbox) lightbox.close();
});

// Contact form: prepares an email in the visitor's email app.
// Replace the placeholder recipient below with your actual email address.
const contactForm = document.getElementById("contactForm");
const formStatus = document.getElementById("formStatus");
const contactRecipient = "your.email@example.com"; // REPLACE with your email address

contactForm.addEventListener("submit", (event) => {
  event.preventDefault();
  const formData = new FormData(contactForm);
  const name = String(formData.get("name") || "").trim();
  const email = String(formData.get("email") || "").trim();
  const message = String(formData.get("message") || "").trim();

  if (!name || !email || !message) {
    formStatus.textContent = "Please complete all fields.";
    return;
  }

  if (contactRecipient === "your.email@example.com") {
    formStatus.textContent = "Replace contactRecipient in js/script.js with your real email address first.";
    return;
  }

  const subject = encodeURIComponent(`Portfolio message from ${name}`);
  const body = encodeURIComponent(`Name: ${name}\nEmail: ${email}\n\n${message}`);
  formStatus.textContent = "Opening your email app. If nothing happens, check your browser's mail settings.";
  window.location.href = `mailto:${contactRecipient}?subject=${subject}&body=${body}`;
});

document.getElementById("year").textContent = new Date().getFullYear();
