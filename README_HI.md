# Selection Marg — Android App Project

यह एक शुरुआती Android Studio प्रोजेक्ट है। इसमें काम करने वाले स्थानीय फीचर हैं:
- Home dashboard
- विषयवार Daily Quiz (स्थानीय प्रश्न)
- टाइमर के साथ Mock Test
- स्कोर और उत्तर की समीक्षा
- Study Planner / tasks (फोन में SharedPreferences के जरिए सेव)
- Notes (फोन में सेव)
- Hindi-first UI

## महत्वपूर्ण सीमाएँ
- यह सोर्स प्रोजेक्ट है, तैयार APK नहीं। इस वातावरण में Android SDK/Gradle build चलाकर APK बनाना और उसे डिवाइस पर टेस्ट करना उपलब्ध नहीं है।
- AI tutor, live current affairs, cloud sync, PDF library, और असली परीक्षा के पूरे प्रश्न-बैंक को अभी शामिल नहीं किया गया है। AI फीचर जोड़ने के लिए सुरक्षित backend/API और नेटवर्क सेटअप चाहिए; API key को APK में सीधे रखना सुरक्षित नहीं है।
- किसी भी सिलेबस/प्रश्न को आधिकारिक परीक्षा-सामग्री का विकल्प न मानें। प्रश्न केवल अभ्यास के लिए हैं।

## APK बनाने के लिए
1. Android Studio इंस्टॉल करें।
2. इस फोल्डर को Android Studio में खोलें।
3. Gradle sync पूरा होने दें।
4. `Build > Build Bundle(s) / APK(s) > Build APK(s)` चुनें।
5. debug APK सामान्यतः `app/build/outputs/apk/debug/app-debug.apk` में बनेगा।
6. अपने फोन में इंस्टॉल करने से पहले अपने Android/Play Protect से स्कैन करें।

## Permissions & safety
ऐप में INTERNET permission नहीं है, इसलिए यह वर्जन नेटवर्क का इस्तेमाल नहीं करता। कोई ads, analytics, account/login, SMS, contacts, location या file access नहीं है। Notes और planner data इस डिवाइस पर SharedPreferences में सेव होते हैं।
