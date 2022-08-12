<template>
  <div class="container mx-auto px-4 h-full">
    <div class="flex content-center items-center justify-center h-full">
      <div class="w-full lg:w-6/12 px-4">
        <div
          class="relative flex flex-col min-w-0 break-words w-full mb-6 shadow-lg rounded-lg bg-blueGray-200 border-0"
        >
          <div class="rounded-t mb-0 px-6 py-6">
            <div class="text-center mb-3">
              <h6 class="text-blueGray-500 text-sm font-bold">
                SNS계정으로 가입하기
              </h6>
            </div>
            <div class="btn-wrapper text-center">
              <button
                class="bg-white active:bg-blueGray-50 text-blueGray-700 font-normal px-4 py-2 rounded outline-none focus:outline-none mr-2 mb-1 uppercase shadow hover:shadow-md inline-flex items-center font-bold text-xs ease-linear transition-all duration-150"
                type="button"
              >
                <img alt="..." class="w-5 mr-1" :src="github" />
                Github
              </button>
            </div>

            <div class="btn-wrapper text-center">
              <button
                class="bg-white active:bg-blueGray-50 text-blueGray-700 font-normal px-4 py-2 rounded outline-none focus:outline-none mr-1 mb-1 uppercase shadow hover:shadow-md inline-flex items-center font-bold text-xs ease-linear transition-all duration-150"
                type="button"
                v-on:click = 'googlelogin'
              >
                <img alt="..." class="w-5 mr-1" :src="google" />
                Google
              </button>
            </div>

            <hr class="mt-6 border-b-1 border-blueGray-300" />
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import github from "@/assets/img/github.svg";
import google from "@/assets/img/google.svg";
import { getAuth, signInWithPopup, GoogleAuthProvider } from "firebase/auth";
//import {useStore} from "vuex";
//import {computed} from "vue";
//import { getAuth, createUserWithEmailAndPassword } from "firebase/auth";
//import Api from "../../Api.js"
export default {
  data() {
    return {
      github,
      google,
      email:'',
      password:'',
      user: {
        token: "",
        birth: "",
        gender: "",
        nickname: "",
        code_id: "",
        uid:"",
    },
    };
  },
  methods:{
      googlelogin: function(){
      const provider = new GoogleAuthProvider();
      signInWithPopup(getAuth(), provider)
    .then((result) => {
      // This gives you a Google Access Token. You can use it to access the Google API.
      const credential = GoogleAuthProvider.credentialFromResult(result);
      console.log(result);
      console.log(credential);
      this.user.uid = result.user.uid;
      //this.user.token = credential.idToken;
      this.user.token = result._tokenResponse.idToken;
      this.$store.commit('setUserInfo',this.user);
      console.log(this.getCounter());
      //this.token = this.credential.accessToken;
      
      // The signed-in user info.
      //this.user = result.user;

      //console.log(result.user.uid);
    // ...
  }).catch((error) => {
    console.log(error)
    // Handle Errors here.
    // const errorCode = error.code;
    // const errorMessage = error.message;
    // // The email of the user's account used.
    // const email = error.customData.email;
    // // The AuthCredential type that was used.
    // const credential = GoogleAuthProvider.credentialFromError(error);
    // ...
  });
  },



    signup (){


      
 
      console.log(this.$store.state.counter);
      this.$store.commit('addCounter');
      console.log(this.$store.state.counter);
      //console.log(this.getCounter);
      //Api.test222();
      console.log("why");
      // createUserWithEmailAndPassword(getAuth(), this.email, this.password)
      //   .then((userCredential) => {
      //     Signed in
      //     console.log(userCredential.user);
      //     alert("회원가입이 되었습니다!");
      //     ...
      //   })
      //   .catch((error) => {
      //     console.log(error.message)
      //   });
    },
    computed:{
      getCounter: function(){
        this.$store.getters.getUserInfo;
      },
      setUserSNS(){
        
      }
    }
  }
};
</script>
