## `Deep note:` Diqqetle nezer yetirseniz qeydlerimi goreceksiniz

- Plan: `Kod yazmaqa bashlamadan planlanlamaqi ustun tuturam vaxt itkisi olmasin deye`
  - Ilk novbede her shey ingilisceye cevirmek `Ingilisce inkishafi ucun`
  - Oyun girish - `🌋 Vulkanik Adadan Qachis oyunu'na Xosh geldiniz `
  - Ad sorgusu - `Adınızı daxil edin: `
  - Enerji və xal izleyicisi sistem `Enerji 100 point, Xal 0 point qeyd olunacaq`
  - Zona 1 – Riyaziyyat sualı
    - Example: `Eli 3 yashindadir, qardashi ondan 2 yaş kichikdir. Əli 10 yashinda olanda qardashi neche yashinda olacaq?`
      - `Mentiqin pis deyil ! Enerji -10, Xal +5`
      - `Mentiq'ivi inkishaf eletdir ! Enerji -10`
  - Zona 2 – for ilə magarada hereket
    - Example: `Magarani kecmek ucun 9 addim atmalisan . . .`
      - `Magarani kechdin ! Enerji -10, Xal +5`
      - `Magarani keche bilmedin ! Enerji -10`
  - Zona 3 – Yon sechimi (if/else)
    - Example: `İki yol var: [S]ol və [S]ağ, Hansını seçirsən ? (Yanlish yol sechsen teleye dusersen !)`
      - `Tehlukesiz yol ! Xal +10`
      - `Teleye dushdun! Enerji -20`
  - Zona 4 – Qapi sechimi (do-while, switch)
    - Example: `3 qapı var. 1, 2 və 3. Dogru qapını tap !`
      - `Qapi 1: Bosh bir otaq. Enerji -5`
      - `Qapi 2: Lava axini ! Enerji -15"`
      - `Qapi 3: Tecili yardim helikopteri ! ✅`
  - Son neticeye esaslanan ferqli cixislar (🏆, ⚠️, 💀)
    - Example:
      - `1.) MOHTESHEM QACHISH! Qehreman kimi xilas oldun ! (fsyo oyun bitdi get kod yaz biraz !)`
      - `2.) Zeifsen, Amma sag qaldın !`
      - `3.) Teesuf ki yandin, tibbi sigortamiz yoxdur ))...`

# **🧩 : “🌋Vulkanik Adadan Qaçış”**

**🎮 Oyun Hekayəsi :**

Bir gün gizli bir adada oyandınız…

Amma bir şey çox yanlışdır.

Ayaqlarınızın altına yerləşən güclü və aktiv bir vulkan yaxın vaxtlarda püskürməyə başlayacaq!

Qaçmaq üçün, dörd təhlükəli zonanı keçməli və adanın şimalında yerləşən təcili yardım helikopterinə çatmalısınız.

Hər zona öz fərqli çətinliyini təqdim edir:

- 📊 Riyaziyyat sualları
- 🧭 Yön seçimləri
- 🔁 Təkrarlanan maneələr
- 🚪 Qapı tapmacaları

Java bacarıqlarınızı istifadə edərsinizsə, sağ qalacaq və adadan qaçacaqsınız!

**🔧 Nə İstifadə Edəcəksiniz?**

Bu oyun üçün aşağıdakı Java mövzularını istifadə edəcəksiniz:

| **Java Mövzusu** | **İstifadə məqsədi**                                |
| ---------------- | --------------------------------------------------- |
| Scanner          | İstifadəçidən giriş almaq                           |
| Primitiv Tipler  | int, char, byte və s. istifadə etmək                |
| if / else        | Cavablara əsaslanaraq qərar vermək                  |
| switch-case      | Qapılar və ya yollar arasında seçim etmək           |
| for döngüsü      | Təkrarlanan hərəkətlər (məsələn, mağarada addımlar) |
| while, do-while  | Doğru seçim edilənə qədər dövr etmək                |
| Konsol Çıxışı    | Əyləncəli və cəlbedici mətn əsaslı oyun təcrübəsi   |

**🎯 Nə Etməlisiniz**

Bir mətn əsaslı macəra oyunu yazmalısınız.

Oyun aşağıdakıları daxil edir:

- Bir hekayə və qərar nöqtələri
- İstifadəçi girişi
- Enerji və bal izləmə
- Əyləncəli çıxışlar ilə emoji və mətnlər

⚠️Hər zonada fərqli bir məntiq və ya riyaziyyat tapşırığı olacaq.

⚠️Siz hesablamalar edəcək, yolları seçəcək, addımları təkrarlayacaq və dərsdə öyrəndiyiniz bütün bilikləri istifadə edəcəksiniz.

⚠️Sonunda isə, son balınıza və qalan enerjinizə əsasən fərqli sonluqlar göstəriləcək:

- 🏆 Uğurlu qaçış
- ⚠️ Zəif amma sağ qalan
- 💀 Vulkanın içinə itmiş

**🗺️ Zona Yoxlaması Ümumi Görünüşü**

| **Zona**                       | **Tapşırıq Növü**        | **İstifadə olunan Java Mövzuları** |
| ------------------------------ | ------------------------ | ---------------------------------- |
| 🌋 Zona 1 – Riyaziyyat Kanyonu | Sadə hesablama sualı     | Scanner, if-else                   |
| ⛏️ Zona 2 – Qaranlıq Mağara    | Addım-addım dövr, maneə  | for döngüsü, variables             |
| 🌉 Zona 3 – Qırıq Körpü        | Sol və ya sağ yol seçimi | char, if-else                      |
| 🔥 Zona 4 – Vulkan Qapıları    | Doğru qapı seçimi dövrü  | do-while, switch-case              |

**📌 Öyrənmə Məqsədləri**

Bu oyunu tamamladığınızda:

- Scanner istifadə edərək əsas giriş/çıxış praktikasını öyrənəcəksiniz
- Şərtli məntiqdən istifadə edərək oyun axışını idarə etməyi öyrənəcəksiniz
- Dövrələri real həyatda tətbiq etməyi öyrənəcəksiniz
- Dəyişənlərdən istifadə edərək vəziyyət izləməyi öyrənəcəksiniz (bal, enerji)
- Həqiqi interaktiv konsol oyunu qurmağı öyrənəcəksiniz
- Java ilə yaradıcı problem həll etmə bacarığınızı inkişaf etdirəcəksiniz!

**✨ Tövsiyələr**

- Yaradıcı olun! Oyun hekayənizi fərdiləşdirə bilərsiniz.
- Emoji və dramatik çıxışlar əlavə edərək daha əyləncəli edə bilərsiniz.
- Kodunuzu təmiz və yaxşı şərh olunmuş saxlayın.

**✅ Təqdimat Yoxlama Siyahısı**

Oyununuza aşağıdakılar daxil olduğundan əmin olun:

- Bir hekayə təqdimatı və ad girişi
- 4 unikal zona və fərqli məntiq tapşırıqları
- Bal və enerji izləmə
- Dövrlər (for, while, do-while)
- if-else, switch şərtləri
- Nəticə mesajı ilə yekun nəticə

**💡 Bonus :**

- Səs effektləri əlavə edin (mətn şəklində!) aşağıda qeyd olunduğu kimi.

```java
System.out.println(
"💀 *Grrr...* Vulkanın içində son bir dəfə səslər eşidilir. Sən artıq çox gecikdin...");

System.out.println("🌋💥 BOOM! Vulkan güclü şəkildə püskürür! Kül və qaynar lavalar havada uçur!");
```

- Yenidən başlama seçimi yaradın
- Özünüz “Qalibsiniz” və ya “Məğlub oldunuz” kimi mesajlarını yaradıcı şəkildə yazın!
