<template>
  <div
    class="relative flex flex-col min-w-0 break-words w-full mb-6 shadow-lg rounded-lg bg-blueGray-50 border-0"
  >
    <div class="rounded-t bg-white mb-0 px-6 py-6">
      <div class="text-center flex justify-between">
        <h6 class="text-blueGray-700 text-xl font-bold">테마 추가</h6>
        <button
          class="bg-purple-500 text-white active:bg-emerald-600 font-bold uppercase text-xs px-4 py-2 rounded shadow hover:shadow-md outline-none focus:outline-none mr-1 ease-linear transition-all duration-150"
          type="button"
        >
          Settings
        </button>
      </div>
    </div>
    <div class="px-4 lg:px-10 py-10 pt-0">
      <form>
        <h6 class="text-blueGray-400 text-sm mt-3 mb-6 font-bold uppercase">
          테마메인이미지
        </h6>
        <div class="flex">
          <!-- <div class="w-full lg:w-6/12 px-4">
            <div class="relative w-full mb-3">
              <label
                class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                htmlFor="grid-password"
              >
                테마 이름
              </label>
              <input
                type="text"
                class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                value="모모게임"
              />
            </div>

            <div class="relative w-full mb-3">
              <label
                class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                htmlFor="grid-password"
              >
                테마 태그
              </label>
              <vue-tags-input
                class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                v-model="tag"
                :tags="tags"
                @tags-changed="(newTags) => (tags = newTags)"
              />
              <input
                type="text"
                class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                placeholder="#공포 #동화"
              />
            </div>
          </div> -->
          <div class="w-full justice-center">
            <!-- <div class="relative w-full mb-3 rounded"> -->
            <!-- <label
                class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                htmlFor="grid-password"
              >
                테마 메인 이미지
              </label> -->
            <!-- <input
                type="email"
                class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                value="jesse@example.com"
              />  -->
            <div>
              <img src="../../../src/assets/escapemain.jpg" />
            </div>
            <!-- </div> -->
          </div>
          <!-- <div class="w-full lg:w-6/12 px-4">
            <div class="relative w-full mb-3">
              <label
                class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                htmlFor="grid-password"
              >
                First Name
              </label>
              <input
                type="text"
                class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                value="Lucky"
              />
            </div>
          </div> -->
          <!-- <div class="w-full lg:w-6/12 px-4">
            <div class="relative w-full mb-3">
              <label
                class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                htmlFor="grid-password"
              >
                Last Name
              </label>
              <input
                type="text"
                class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                value="Jesse"
              />
            </div>
          </div> -->
        </div>

        <hr class="mt-6 border-b-1 border-blueGray-300" />

        <h6 class="text-blueGray-400 text-sm mt-3 mb-6 font-bold uppercase">
          테마 정보
        </h6>
        <div class="flex flex-wrap">
          <div class="w-full lg:w-12/12 px-4">
            <div class="relative w-full mb-3">
              <label
                class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                htmlFor="grid-password"
              >
                테마이름
              </label>
              <input
                type="text"
                class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                value="Bld Mihail Kogalniceanu, nr. 8 Bl 1, Sc 1, Ap 09"
              />
            </div>
            <div class="relative w-full mb-3">
              <label
                class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                htmlFor="grid-password"
              >
                테마 난이도
              </label>
              <div class="flex">
                <button
                  type="button"
                  v-for="i in 5"
                  class="focus:outline-none"
                  @click="changeStar(i)"
                  :key="i"
                >
                  <svg
                    class="block h-8 w-8"
                    :class="[rooms.level >= i ? 'text-blue' : 'text-grey']"
                    fill="currentColor"
                    xmlns="http://www.w3.org/2000/svg"
                    viewBox="0 0 20 20"
                  >
                    <path
                      d="M10 15l-5.878 3.09 1.123-6.545L.489 6.91l6.572-.955L10 0l2.939 5.955 6.572.955-4.756 4.635 1.123 6.545z"
                    />
                  </svg>
                </button>
              </div>
            </div>
            <div class="relative w-full mb-3">
              <label
                class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                htmlFor="grid-password"
              >
                테마 태그
              </label>
              <InputTag v-model="tags" @change="handleCcChange"></InputTag>
            </div>
          </div>
          <div class="w-full lg:w-4/12 px-4">
            <div class="relative w-full mb-3">
              <label
                class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                htmlFor="grid-password"
              >
                최소인원
              </label>
              <input
                type="text"
                class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                value="2"
              />
            </div>
          </div>
          <div class="w-full lg:w-4/12 px-4">
            <div class="relative w-full mb-3">
              <label
                class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                htmlFor="grid-password"
              >
                최대인원
              </label>
              <input
                type="text"
                class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                value="5"
              />
            </div>
          </div>
          <div class="w-full lg:w-4/12 px-4">
            <div class="relative w-full mb-3">
              <label
                class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                htmlFor="grid-password"
              >
                제한시간
              </label>
              <input
                type="text"
                class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                placeholder="분단위로입력해주세요"
              />
            </div>
          </div>
        </div>
        <div>
          <h6 class="text-blueGray-400 text-sm mt-3 mb-6 font-bold uppercase">
            테마예약 가능 시간
          </h6>
        </div>

        <div>
          <div class="flex">
            <ScrollPicker :options="hour" v-model="timehour" />
            <ScrollPicker :options="minute" v-model="timeminute" />
          </div>
        </div>
        <div class="hover:MainYellow" @click="test()">추가</div>
        <div>
          <InputTag v-model="list" @change="handleCcChange" disabled></InputTag>
        </div>
        <hr class="mt-6 border-b-1 border-blueGray-300" />

        <h6 class="text-blueGray-400 text-sm mt-3 mb-6 font-bold uppercase">
          테마 설명
        </h6>
        <div class="flex flex-wrap">
          <div class="w-full lg:w-12/12 px-4">
            <div class="relative w-full mb-3">
              <!-- <label
                class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                htmlFor="grid-password"
              >
                테마 설명
              </label> -->
              <textarea
                type="text"
                class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                rows="4"
              >
                XX야 이거 너만 알려주는거야 꼭 비밀로 해야해
                친구가 내 스마트폰에 깔아준 어떤 앱...
                그리고 그날밤 친구에게 온 메세지 "XX야 살려줘..무서워.."

                그리고 다음날 그친구는 자살한채로 발견되고...
                  </textarea
              >
            </div>
          </div>
        </div>
      </form>
    </div>
  </div>
</template>
<script>
import "vue-scroll-picker/dist/style.css";
//import StarRating from "./StarRating.vue";
//import VueTagsInput from "@johmun/vue-tags-input";
import InputTag from "vue-input-tag";
import { ScrollPicker } from "vue-scroll-picker";
export default {
  components: {
    ScrollPicker,
    InputTag,
    //StarRating,
    //ScrollPickerGroup,
  },

  data() {
    return {
      tag: "",
      tags: [],
      list: [],
      rooms: {
        level: 0,
      },
      rating: 5,
      currentYear: new Date().getFullYear(),
      currentMonth: 1,
      currentDay: 1,
      timehour: 9,
      timeminute: 30,
    };
  },
  computed: {
    years() {
      const currYear = new Date().getFullYear();
      const lastYear = 1980;
      return Array.from(
        { length: currYear - lastYear + 1 },
        (_, index) => lastYear + index
      ).reverse();
    },
    months() {
      return Array.from({ length: 12 }, (_, index) => index + 1);
    },
    days() {
      const lastDay = new Date(
        this.currentYear,
        this.currentMonth,
        0
      ).getDate();
      return Array.from({ length: lastDay }, (_, index) => index + 1);
    },
    hour() {
      return Array.from({ length: 23 }, (_, index) => index + 1);
    },
    minute() {
      return Array.from({ length: 59 }, (_, index) => index + 1);
    },
  },
  methods: {
    test() {
      this.list.push(this.timehour + ":" + this.timeminute);
    },
    handleCcChange(list) {
      console.log(list);
    },
    changeStar(index) {
      alert(index);
      this.rooms.level = index;
    },
  },
};
</script>
<style scoped></style>
