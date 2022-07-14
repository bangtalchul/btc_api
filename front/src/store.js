import { createStore } from "vuex";

export default createStore({
  state: {
    user: {
      uid: "ssss",
      way: "",
    },
  },
  mutations: {
    UserStateChange(state, uid) {
      state.user.uid = uid;
    },
  },
});
