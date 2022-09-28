<template>
  <div
    class="relative flex flex-col min-w-0 break-words w-full mb-6 shadow-lg rounded-lg bg-blueGray-50 border-0"
  >
    <div class="rounded-t bg-white mb-0 px-6 py-6">
      <div class="text-center flex justify-between">
        <h6 class="text-blueGray-700 text-xl font-bold">테마 추가</h6>
        <button
          class="bg-MainViolet text-white active:bg-emerald-600 font-bold uppercase text-xs px-4 py-2 rounded shadow hover:shadow-md outline-none focus:outline-none mr-1 ease-linear transition-all duration-150"
          type="button"
        >
          저장하기
        </button>
      </div>
    </div>
    <div class="px-4 lg:px-10 py-10 pt-0">
      <form>
        <h6 class="text-blueGray-400 text-sm mt-3 mb-6 font-bold uppercase">
          테마메인이미지
        </h6>
        <div class="flex">
          <div class="w-1/3 justify-center">
            <div v-if="preview" class="pt-3 pl-8">
              <img :src="preview" class="img-fluid object-contain h-52 w-52" />
              <!-- <p class="mb-0">file name: {{ image.name }}</p> -->
              <!-- <p class="mb-0">size: {{ image.size / 1024 }}KB</p> -->
            </div>
          </div>
          <div class="w-2/3 justice-center">
            <div id="app" class="container my-3">
              <div class="row">
                <div class="col-md-5 offset-md-1">
                  <form>
                    <div class="form-group">
                      <!-- <label for="my-file">Select Image</label> -->

                      <div class="flex justify-center items-center w-full">
                        <label
                          for="dropzone-file"
                          class="flex flex-col justify-center items-center w-full h-52 bg-gray-50 rounded-lg border-2 border-gray-300 border-dashed cursor-pointer dark:hover:bg-bray-800 dark:bg-gray-700 hover:bg-gray-100 dark:border-gray-600 dark:hover:border-gray-500 dark:hover:bg-gray-600"
                        >
                          <div
                            class="flex flex-col justify-center items-center pt-5 pb-6"
                          >
                            <svg
                              aria-hidden="true"
                              class="mb-3 w-10 h-10 text-gray-400"
                              fill="none"
                              stroke="currentColor"
                              viewBox="0 0 24 24"
                              xmlns="http://www.w3.org/2000/svg"
                            >
                              <path
                                stroke-linecap="round"
                                stroke-linejoin="round"
                                stroke-width="2"
                                d="M7 16a4 4 0 01-.88-7.903A5 5 0 1115.9 6L16 6a5 5 0 011 9.9M15 13l-3-3m0 0l-3 3m3-3v12"
                              ></path>
                            </svg>
                            <p
                              class="mb-2 text-sm text-gray-500 dark:text-gray-400"
                            >
                              <span class="font-semibold"
                                >파일을 올려주세요</span
                              >
                            </p>
                            <p class="text-xs text-gray-500 dark:text-gray-400">
                              SVG, PNG, JPG or GIF (MAX. 800x400px)
                            </p>
                          </div>
                          <input
                            id="dropzone-file"
                            type="file"
                            class="hidden"
                            @change="previewImage"
                          />
                        </label>
                      </div>

                      <!-- <input
                        type="file"
                        accept="image/*"
                        @change="previewImage"
                        class="form-control-file"
                        id="my-file"
                      /> -->
                    </div>
                  </form>
                </div>
              </div>
            </div>
          </div>
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
              <div class="flex justify-center">
                <div v-for="i in 3" :key="i">
                  <svg
                    xmlns="http://www.w3.org/2000/svg"
                    fill="gold"
                    viewBox="0 0 24 24"
                    stroke-width="1.5"
                    stroke="currentColor"
                    class="w-10 h-10"
                  >
                    <path
                      stroke-linecap="round"
                      stroke-linejoin="round"
                      d="M11.48 3.499a.562.562 0 011.04 0l2.125 5.111a.563.563 0 00.475.345l5.518.442c.499.04.701.663.321.988l-4.204 3.602a.563.563 0 00-.182.557l1.285 5.385a.562.562 0 01-.84.61l-4.725-2.885a.563.563 0 00-.586 0L6.982 20.54a.562.562 0 01-.84-.61l1.285-5.386a.562.562 0 00-.182-.557l-4.204-3.602a.563.563 0 01.321-.988l5.518-.442a.563.563 0 00.475-.345L11.48 3.5z"
                    />
                  </svg>
                </div>
                <div v-for="i in 2" :key="i">
                  <svg
                    xmlns="http://www.w3.org/2000/svg"
                    fill="none"
                    viewBox="0 0 24 24"
                    stroke-width="1.5"
                    stroke="currentColor"
                    class="w-10 h-10"
                  >
                    <path
                      stroke-linecap="round"
                      stroke-linejoin="round"
                      d="M11.48 3.499a.562.562 0 011.04 0l2.125 5.111a.563.563 0 00.475.345l5.518.442c.499.04.701.663.321.988l-4.204 3.602a.563.563 0 00-.182.557l1.285 5.385a.562.562 0 01-.84.61l-4.725-2.885a.563.563 0 00-.586 0L6.982 20.54a.562.562 0 01-.84-.61l1.285-5.386a.562.562 0 00-.182-.557l-4.204-3.602a.563.563 0 01.321-.988l5.518-.442a.563.563 0 00.475-.345L11.48 3.5z"
                    />
                  </svg>
                </div>
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
                rows="12"
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
      timeminute: 0,
      preview: null,
      image: null,
      preview_list: [],
      image_list: [],
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
      var m = [];
      for (var i = 0; i < 60; i++) {
        if (i < 10) {
          m.push(`0${i}`);
        } else {
          m.push(i);
        }
      }
      return m;
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
    previewImage: function (event) {
      var input = event.target;
      if (input.files) {
        var reader = new FileReader();
        reader.onload = (e) => {
          this.preview = e.target.result;
        };
        this.image = input.files[0];
        reader.readAsDataURL(input.files[0]);
      }
    },
  },
};
</script>
<style scoped></style>
