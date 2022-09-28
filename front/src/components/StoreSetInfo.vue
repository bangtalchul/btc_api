<template>
  <div
    class="relative flex flex-col min-w-0 break-words w-full mb-6 shadow-lg rounded-lg bg-blueGray-50 border-0"
  >
    <div class="rounded-t bg-white mb-0 px-6 py-6">
      <div class="text-center flex justify-between">
        <h6 class="text-blueGray-700 text-xl font-bold">스토어 정보</h6>
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
          스토어메인이미지
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
          스토어 정보
        </h6>
        <div class="flex flex-wrap">
          <div class="w-full lg:w-1/2 px-4">
            <div class="relative w-full mb-3">
              <label
                class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                htmlFor="grid-password"
              >
                업체명
              </label>
              <input
                type="text"
                class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                value="이스케이프서면"
              />
            </div>
          </div>
          <div class="w-full lg:w-1/2 px-4">
            <div class="relative w-full mb-3">
              <label
                class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                htmlFor="grid-password"
              >
                업체번호
              </label>
              <input
                type="text"
                class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                value="010-1234-5678"
              />
            </div>
          </div>
          <div class="w-full lg:w-12/12 px-4">
            <div class="relative w-full mb-3">
              <label
                class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                htmlFor="grid-password"
              >
                업체주소
              </label>
              <input
                type="text"
                class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                value="Bld Mihail Kogalniceanu, nr. 8 Bl 1, Sc 1, Ap 09"
              />
            </div>
          </div>
        </div>
        <hr class="mt-6 border-b-1 border-blueGray-300" />

        <h6 class="text-blueGray-400 text-sm mt-3 mb-6 font-bold uppercase">
          업체 설명
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
              </textarea>
            </div>
          </div>
        </div>
      </form>
    </div>
  </div>
</template>
<script>
export default {
  components: {},

  data() {
    return {
      preview: null,
      image: null,
      preview_list: [],
      image_list: [],
    };
  },
  methods: {
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
