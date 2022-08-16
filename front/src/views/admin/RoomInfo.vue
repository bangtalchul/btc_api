<template>


<div>
    <!-- <div class="relative md:ml-64 bg-blueGray-100"> -->
      <header-stats />
      <!-- <div class="px-4 md:px-10 mx-auto w-full -m-24">
        <router-view />
        <footer-admin />
      </div> -->
    <!-- </div> -->
 </div>
</template>
<script>
//import CardTable from "@/components/Cards/CardTable.vue";

import HeaderStats from "@/components/Headers/HeaderStats.vue";
//import FooterAdmin from "@/components/Footers/FooterAdmin.vue";

export default {
  components: {
    HeaderStats,
    //FooterAdmin,
  },
};
</script>
