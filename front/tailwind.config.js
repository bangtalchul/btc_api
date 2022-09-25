/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./**/*.html",
    "./*.html",
    "./**/*.js",
    "./*.js",
    "./**/*.vue",
    "./*.vue",
  ],
  theme: {
    extend: {
      colors: {
        MainViolet: "#552084",
        MainYellow: "#FDBA21",
      },
    },
  },
  plugins: [],
};
