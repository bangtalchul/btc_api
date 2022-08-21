<template>
  <div>
    <!-- <sidebar /> -->
    <index-navbar />
      
      <section
      class="header relative items-center flex pt-20 max-h-860-px"
    >
    <div class="w-full bg-blueGray-100">
           <div className="mainSkill bg-indigo-600 pb-16 relative overflow-hidden">
                  <div className="flex flex-row mb-10 absolute animate-slider">
                    <img className="w-100 h-full mx-10" src="@/assets/img/angular.jpg" alt="html logo" />
                    <img className="w-100 h-full mx-10" src="@/assets/img/angular.jpg" alt="html logo" />
                    <img className="w-100 h-full mx-10" src="@/assets/img/angular.jpg" alt="html logo" />
                    <img className="w-100 h-full mx-10" src="@/assets/img/angular.jpg" alt="html logo" />
                    <img className="w-100 h-full mx-10" src="@/assets/img/angular.jpg" alt="html logo" />
                    <img className="w-100 h-full mx-10" src="@/assets/img/angular.jpg" alt="html logo" />
                    <img className="w-100 h-full mx-10" src="@/assets/img/angular.jpg" alt="html logo" />
                    <img className="w-100 h-full mx-10" src="@/assets/img/angular.jpg" alt="html logo" />
                    <img className="w-100 h-full mx-10" src="@/assets/img/angular.jpg" alt="html logo" />
                    <img className="w-100 h-full mx-10" src="@/assets/img/angular.jpg" alt="html logo" />
                    <img className="w-100 h-full mx-10" src="@/assets/img/angular.jpg" alt="html logo" />
                    <img className="w-100 h-full mx-10" src="@/assets/img/angular.jpg" alt="html logo" />
                  </div>
            </div>
      <admin-navbar />
      <header-stats />
      <!-- <div class="px-4 md:px-10 mx-auto w-full -m-24">
        <router-view />
        <footer-admin />
      </div> -->
    </div>
   </section>
  </div>
</template>
<script>
import AdminNavbar from "@/components/Navbars/AdminNavbar.vue";
// import Sidebar from "@/components/Sidebar/Sidebar.vue";
import HeaderStats from "@/components/Headers/HeaderStats.vue";
// import FooterAdmin from "@/components/Footers/FooterAdmin.vue";
import IndexNavbar from "@/components/Navbars/IndexNavbar.vue";
export default {
  data(){
    return{
      testimg: "@/img/angular.jpg",
      testimg2: "@/assets/img/bootstrap.jpg",
    }
  },
  name: "admin-layout",
  components: {
    AdminNavbar,
    // Sidebar,
    HeaderStats,
    // FooterAdmin,
    IndexNavbar
  },
};
</script>
