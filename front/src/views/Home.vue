<template>
  <div>
    <div class="flex justify-end mb-2">
      <button
        class="flex inline-block px-3 py-2 text-gray-700 font-medium text-sm leading-snug uppercase rounded hover:bg-gray-300 hover:shadow-lg focus:bg-gray-400 focus:shadow-lg focus:outline-none focus:ring-0 active:bg-gray-200 active:shadow-lg transition duration-150 ease-in-out"
        v-on:click="addTheme()"
      >
        테마추가하기
        <svg
          xmlns="http://www.w3.org/2000/svg"
          viewBox="0 0 448 512"
          class="w-3.5 h-3.5 ml-1"
        >
          <!--! Font Awesome Pro 6.1.2 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2022 Fonticons, Inc. -->
          <path
            d="M432 256c0 17.69-14.33 32.01-32 32.01H256v144c0 17.69-14.33 31.99-32 31.99s-32-14.3-32-31.99v-144H48c-17.67 0-32-14.32-32-32.01s14.33-31.99 32-31.99H192v-144c0-17.69 14.33-32.01 32-32.01s32 14.32 32 32.01v144h144C417.7 224 432 238.3 432 256z"
          />
        </svg>
      </button>
    </div>
    <!-- <index-navbar /> -->
    <slider />
    <div class="mt-6">
      <card-page-visits />
    </div>
  </div>
</template>

<script>
// @ is an alias to /src
import Slider from "@/components/slider.vue";
import CardPageVisits from "@/components/Cards/CardPageVisits.vue";

export default {
  name: "Home",
  components: {
    Slider,
    CardPageVisits,
  },
  methods: {
    addTheme() {
      this.$router.push({
        path: "add",
      });
    },
  },
};
</script>
