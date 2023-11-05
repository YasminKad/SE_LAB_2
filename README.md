# SE_LAB_2
# Step1

#STEP3[PART 2]
<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>single responsibility principle (SRP)</p>
</td>
<td width="246">
<p>در کلاس Main تمامی فرایندهای عملیاتی برنامه تنها در یک تابع main پیاده سازی شده اند که این به خودی خود موجب نقض این اصل است و می بایست در توابع جداگانه هر کدام از این فرایند ها مدیریت می شدند و در نهایت در یک تابع کلی آن توابع اتمیک و تک کار فراخوانی می شدند.</p>
</td>
<td width="284">
<p>اضافه کردن توابع ریزتر و جلوگیری از شکل گرفتن یک تابع کلی بزرگ. در نهایت می‌توان همه توابع را در یک تابع کلی دیگر در Main فراخوانی کرد.</p>
</td>
</tr>
<tr>
<td width="168">
<p>single responsibility principle (SRP)</p>
</td>
<td width="246">
<p>یاده سازی تابع onSiteOrderRegister برای کلاس های PhoneOrderService و OnlineOrderService این اصل را نقض می‌کند چرا که مسئولیت متفرقه‌ای از این کلاس به آنها نسبت داده شده و در آن ها پیاده سازی شده است.
</p>
</td>
<td width="284">
<p>برای مسئولیت‌های متفرقه این کلاس کلاس‌های جداگانه به وجود بیاوریم و سپس آنها را با توابع مربوطه پر کنیم.</p>
</td>
</tr>
<tr>
<td width="168">
<p>single responsibilty principle (SRP)</p>
</td>
<td width="246">
<p>پیاده سازی تابع onlineOrderRegister برای کلاس های PhoneOrderService و OnSiteOrderService این اصل را نقض می‌کند چرا که مسئولیت متفرقه‌ای از این کلاس به آنها نسبت داده شده و در آن ها پیاده سازی شده است.</p>
</td>
<td width="284">
<p>برای مسئولیت‌های متفرقه این کلاس کلاس‌های جداگانه به وجود بیاوریم و سپس آنها را با توابع مربوطه پر کنیم.</p>
</td>
</tr>
<tr>
<td width="168">
<p>single responsibilty principle (SRP)</p>
</td>
<td width="246">
<p>پیاده سازی تابع onlineOrderPayment برای کلاس های PhoneOrderService و OnSiteOrderService این اصل را نقض می‌کند چرا که مسئولیت متفرقه‌ای از این کلاس به آنها نسبت داده شده و در آن ها پیاده سازی شده است.</p>
</td>
<td width="284">
<p>برای مسئولیت‌های متفرقه این کلاس کلاس‌های جداگانه به وجود بیاوریم و سپس آنها را با توابع مربوطه پر کنیم.</p>
</td>
</tr>
<tr>
<td width="168">
<p>single responsibilty principle (SRP)</p>
</td>
<td width="246">
<p>پیاده سازی تابع phoneOrderRegister برای کلاس های OnlineOrderService و OnSiteOrderService این اصل را نقض می‌کند چرا که مسئولیت متفرقه‌ای از این کلاس به آنها نسبت داده شده و در آن ها پیاده سازی شده است.</p>
</td>
<td width="284">
<p>برای مسئولیت‌های متفرقه این کلاس کلاس‌های جداگانه به وجود بیاوریم و سپس آنها را با توابع مربوطه پر کنیم.</p>
</td>
</tr>
<tr>
<td width="168">
<p>single responsibilty principle (SRP)</p>
</td>
<td width="246">
<p>پیاده سازی تابع phoneOrderPayment برای کلاس های OnlineOrderService و OnSiteOrderService این اصل را نقض می‌کند چرا که مسئولیت متفرقه‌ای از این کلاس به آنها نسبت داده شده و در آن ها پیاده سازی شده است.</p>
</td>
<td width="284">
<p>برای مسئولیت‌های متفرقه این کلاس کلاس‌های جداگانه به وجود بیاوریم و سپس آنها را با توابع مربوطه پر کنیم.</p>
</td>
</tr>
<tr>
<td width="168">
<p>open closed principle (OCP</p>
</td>
<td width="246">
<p>کلاس های OnlineOrderService و OnSiteOrderService با ایجاد یک کلاس جدید PhoneOrderService که کاملا به آن ها بی ربط بود و کارکرد جداگانه ای داشت، تغییر کردند.</p>
</td>
<td width="284">
<p>استفاده از ارث‌بری و dependency injection</p>
</td>
</tr>
<tr>
<td width="168">
<p>Interface Segregation Principle</p>
</td>
<td width="246">
<p>پیاده سازی تابع onSiteOrderRegister برای کلاس های PhoneOrderService و OnlineOrderService (که عملکرد این تابع به هیچ کدام از این دو کلاس مربوط نیست و این بسیار نامناسب است)
</p>
</td>
<td width="284">
<p>کلاس‌بندی جدید برای رفع تراکم‌های اضافی</p>
</td>
</tr>
<tr>
<td width="168">
<p>Interface Segregation Principle</p>
</td>
<td width="246">
<p>پیاده سازی تابع onSiteOrderPeyment برای کلاس های PhoneOrderService و OnlineOrderService (که عملکرد این تابع به هیچ کدام از این دو کلاس مربوط نیست و این بسیار نامناسب است)</p>
</td>
<td width="284">
<p>کلاس‌بندی جدید برای رفع تراکم‌های اضافی</p>
</td>
</tr>
<tr>
<td width="168">
<p>Interface Segregation Principle</p>
</td>
<td width="246">
<p>پیاده سازی تابع onlineOrderRegister برای کلاس های PhoneOrderService و OnSiteOrderService (که عملکرد این تابع به هیچ کدام از این دو کلاس مربوط نیست و این بسیار نامناسب است)</p>
</td>
<td width="284">
<p>کلاس‌بندی جدید برای رفع تراکم‌های اضافی</p>
</td>
</tr>
<tr>
<td width="168">
<p>Interface Segregation Principle</p>
</td>
<td width="246">
<p>پیاده سازی تابع onlineOrderPayment برای کلاس های PhoneOrderService و OnSiteOrderService (که عملکرد این تابع به هیچ کدام از این دو کلاس مربوط نیست و این بسیار نامناسب است)</p>
</td>
<td width="284">
<p>کلاس‌بندی جدید برای رفع تراکم‌های اضافی</p>
</td>
</tr>
<tr>
<td width="168">
<p>Interface Segregation Principle</p>
</td>
<td width="246">
<p>پیاده سازی تابع phoneOrderRegister برای کلاس های OnlineOrderService و OnSiteOrderService (که عملکرد این تابع به هیچ کدام از این دو کلاس مربوط نیست و این بسیار نامناسب است)</p>
</td>
<td width="284">
<p>کلاس‌بندی جدید برای رفع تراکم‌های اضافی</p>
</td>
</tr>
<tr>
<td width="168">
<p>Interface Segregation Principle</p>
</td>
<td width="246">
<p>پیاده سازی تابع phoneOrderPayment برای کلاس های OnlineOrderService و OnSiteOrderService (که عملکرد این تابع به هیچ کدام از این دو کلاس مربوط نیست و این بسیار نامناسب است)</p>
</td>
<td width="284">
<p>کلاس‌بندی جدید برای رفع تراکم‌های اضافی</p>
</td>
</tr>
<tr>
<td width="168">
<p>Dependency Inversion Principle</p>
</td>
<td width="246">
<p>با افزودن کلاس PhoneOrderService مجبور شدیم کلاس Main در بخش Payment را تغییر دهیم</p>
</td>
<td width="284">
<p>اضافه کردن abstraction به پروژه</p>
</td>
</tr>
<tr>
<td width="168">
<p>Dependency Inversion Principle</p>
</td>
<td width="246">
<p>با افزودن کلاس PhoneOrderService مجبور شدیم که توابعی جدید به واسط کلی OrderService اضافه کنیم که این مساله به خودی خود موجب شد که ما ناچار به تغییر کلاس هایی که این واسط را پیاده سازی میکردند شویم.</p>
</td>
<td width="284">
<p>اضافه کردن abstraction به پروژه</p>
</td>
</tr>
</tbody>
</table>

# Step4

# Step5

اگر requirement های پروژه ما اپدیت شوند و کد نیازمند تغییر (افزودن کد - تغییر قسمت های قبلی - حذف کد - بهبود کد های موجود) باشد، با رعایت اصول SOLID هزینه ی این تغییر برای ما بسیار کمتر خواهد بود چرا که با رعایت این اصول coupling قسمت های مختلف کد ما به حداقل رسیده و cohesion آن نیز زیاد می شود که اتفاق بر خوانا بودن کد و قابلیت نگهداری آن می افزاید.

مجموع تعداد تغییرات: ..............
