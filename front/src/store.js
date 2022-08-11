// import { createStore } from "vuex";

// export default createStore({
//   state: {
//     counter: 10,
//   },
//   getters: {
//     gettest(state) {
//       return state.counter + 1;
//     },
//   },
//   mutations: {
//     setCounter(state, value) {
//       state.counter = value;
//     },
//   },
// });

import Vuex from "vuex";

export const store = new Vuex.Store({
  state: {
    counter: 0,
  },
  getters: {
    getcounter: function (state) {
      return state.counter;
    },
  },
  mutations: {
    addCounter: function (state) {
      return state.counter++;
    },
  },
});
