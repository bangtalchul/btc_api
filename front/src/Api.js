//import { getAuth, signInWithEmailAndPassword, signInWithPopup, GoogleAuthProvider } from "firebase/auth";

// export function test() {
//   console.log("test");
// }
import { useStore } from "vuex";
//import { computed } from "vue";
export default {
  test: () => {
    const store = useStore();
    const aaaa = store;
    console.log(aaaa);
  },
  test222: () => {
    console.log("test222");
  },
};
