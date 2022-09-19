<template>
  <div class="bg-gray-200 h-52">
    <div v-if="auth == false">
      <div class="text-xl p-10">
        <div>사업자인증이 안되었습니다🏢</div>
        <div>사업자등록증 인증하고 가게를 등록하세요!</div>
      </div>
      <button class="bg-purple-800 rounded-md w-80 h-14 text-white text-lg">
        사업자인증하기
      </button>
    </div>
    <div :class="[auth ? 'block' : 'hidden']">aaaa</div>
  </div>
</template>
<script>
//import Navbar from "@/components/Navbars/AuthNavbar.vue";
//import FooterComponent from "@/components/Footers/Footer.vue";

import team2 from "@/assets/team-2-800x800.jpg";

export default {
  data() {
    return {
      team2,
      auth: false,
    };
  },
  components: {
    //Navbar,
    //FooterComponent,
  },
};
</script>
