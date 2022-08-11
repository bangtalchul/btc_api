//import { getAuth, signInWithEmailAndPassword, signInWithPopup, GoogleAuthProvider } from "firebase/auth";

//import store from "./store";

// export function test() {
//   console.log("test");
// }
import { useStore } from "vuex";
import { computed } from "vue";

export default {
  setup() {
    const store = useStore();
    return {
      count: computed(() => store.state.count),
      evenOrOdd: computed(() => store.getters.evenOrOdd),
      increment: () => store.dispatch("increment"),
      decrement: () => store.dispatch("decrement"),
      incrementIfOdd: () => store.dispatch("incrementIfOdd"),
      incrementAsync: () => store.dispatch("incrementAsync"),
    };
  },
  method: {
    test() {
      console.log(this.count);
    },
    test222() {
      console.log("test222");
    },
  },
};
