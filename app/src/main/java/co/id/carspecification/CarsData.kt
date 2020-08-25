package co.id.carspecification

object CarsData {
    private val carNames = arrayOf("Mercedes E-Class",
        "Porsche Macan",
        "Mercedes GLB",
        "Škoda Octavia",
        "Seat Leon",
        "Audi RS 4",
        "Land Rover Defender",
        "Peugeot 2008",
        "Chevloret Silverado",
        "Nissan Juke")

    private val carDetails = arrayOf("The 2021 Mercedes-Benz E-class epitomizes sophistication with its bleeding technology, classy appearance, and extravagant cabin. Available as a four-door sedan or two-door coupe and cabriolet, the Mercedes can be made to match all manner of upper-class lifestyles. It also offers a set of distinct powertrains that range from an entry-level four-cylinder to a plug-in hybrid to a zesty turbocharged six-cylinder that makes 362 horsepower.",
        "The Porsche Macan (Type 95B) is a five-door luxury crossover SUV produced by the German car manufacturer Porsche from 2014. It is built in Leipzig, Germany. The Macan range includes many variants, including the Macan, Macan S, Macan S Diesel, Macan GTS and the Macan Turbo. The Porsche Macan shares a platform with the Audi Q5.",
        "The Mercedes-Benz GLB-Class is a front-engine, front or four wheel drive five-door luxury subcompact crossover SUV unveiled by the German manufacturer Daimler AG on 10 June 2019 in Park City, Utah. It was previously unveiled as a concept car to the public at the Shanghai Auto Show in April 2019.[4] The GLB is positioned between the GLA-Class crossover and the larger GLC-Class SUV in size.",
        "The Škoda Octavia is a small family car produced by the Czech car manufacturer Škoda Auto since the end of 1996. It shares its name with an earlier model produced between 1959 and 1971. Four generations of the modern-era Octavia model have been introduced to date, delivered with five-door liftback saloon or five-door estate styles only. The car is front engined, both front- or four-wheel drive are offered. Around five million units have been sold in its two decades of presence on the market. The Octavia is Škoda's most popular model; about 40% of all newly manufactured Škoda cars are Octavias.",
        "The SEAT León (Spanish pronunciation: [ˈse.at leˈon], also spelled Leon outside of Spain, (means \"Lion\", or also Leon, an old Kingdom of Spain) is a hatchback compact car built by the Spanish car manufacturer SEAT since October 1998. The first two Leon generations used two differing variants of the Volkswagen Group A platform, and shared many components with other Volkswagen Group cars. The third and fourth (current) generation use the Volkswagen Group MQB platform, also used by the Audi A3 Mk3 and Mk4, Volkswagen Golf Mk7 and Mk8 and Škoda Octavia Mk3, Mk4.",
        "The Audi RS 4 is the high-performance variant of the Audi A4 range produced by Audi Sport GmbH for AUDI AG, a division of the Volkswagen Group. It slots distinctly above the Audi S4 as the fastest, most sports-focused car based on the A4's \"B\" automobile platform. The RS 4 made a return in 2012 in Avant form, based on the A4 Avant. The original B5 version was produced only as an Avant, Audi's name for an estate car/station wagon. The second version, the B7, was released initially as a four-door five-seat saloon/sedan, with the Avant following a short while later. A two-door four-seat Cabriolet version was subsequently added. Their internal combustion engines are longitudinal and located at the front.The Audi RS 4 is the high-performance variant of the Audi A4 range produced by Audi Sport GmbH for AUDI AG, a division of the Volkswagen Group. It slots distinctly above the Audi S4 as the fastest, most sports-focused car based on the A4's \"B\" automobile platform. The RS 4 made a return in 2012 in Avant form, based on the A4 Avant. The original B5 version was produced only as an Avant, Audi's name for an estate car/station wagon. The second version, the B7, was released initially as a four-door five-seat saloon/sedan, with the Avant following a short while later. A two-door four-seat Cabriolet version was subsequently added. Their internal combustion engines are longitudinal and located at the front.",
        "The Land Rover Defender (originally called simply Land Rover Ninety, and later called the Land Rover Ninety and Land Rover One Ten) is a British four-wheel drive off-road vehicle developed in the 1980s from the original Land Rover series which was launched at the Amsterdam Motor Show in April 1948. The vehicle (a British equivalent of the WWII Willys Jeep) gained a worldwide reputation for ruggedness and versatility. Using a steel ladder chassis and an aluminium alloy bodywork, the Land Rover originally used detuned versions of Rover car engines.",
        "The Peugeot 2008 (pronounced as Two Thousand and Eight or in French: Deux Mille Huit) is a subcompact crossover SUV produced by the French manufacturer Peugeot since 2013. The 2008 replaced the Peugeot 207 SW, as Peugeot did not plan to release an SW version of its 208.",
        "The Chevrolet Silverado is a range of trucks manufactured by General Motors under the Chevrolet brand. Introduced for the 1999 model year, the Silverado is the successor to the long-running Chevrolet C/K model line. Taking its name from the top trim level from the Chevrolet C/K series, the Silverado is offered as a series of full-size pickup trucks, chassis cab trucks, and medium-duty trucks. The fourth generation of the model line was introduced for the 2019 model year.",
        "The Nissan Juke (Japanese: 日産・ジューク, Nissan Jūku) is a subcompact crossover SUV produced by the Japanese car manufacturer Nissan since 2010. The production version made its debut at the 2010 Geneva Motor Show in March, and was introduced to North America at the 2010 New York International Auto Show to be sold for the 2011 model year. The name \"juke\" means to dance or change directions demonstrating agility.")

    private val carImages = intArrayOf(
        R.drawable.mercedes_eclass,
        R.drawable.porsche,
        R.drawable.mercedes_glb,
        R.drawable.skoda_octavia,
        R.drawable.seat_leon,
        R.drawable.audi_rs4,
        R.drawable.landrover_defender,
        R.drawable.peugeot_2008,
        R.drawable.chevy_silverado,
        R.drawable.nissan_juke
    )

    private val carYear = arrayOf("2020",
        "2020",
        "2019",
        "2020",
        "2019",
        "2020",
        "2021",
        "2020",
        "2020",
        "2020"
    )

    private val carYoutube = arrayOf("XO93x4PAI1U",
        "n0GfR7IG5d4",
        "xW-RSl1c3aQ",
        "SErOkO4UIXE",
        "wLiuQBRN5zU",
        "3AyakgPZTZg",
        "e1r3Ce3129w",
        "iKN6lpFsB6g",
        "7OJjLNO1IBw",
        "X3cVttIXmOs"
    )

    val listData: ArrayList<Car>
        get() {
            val list = arrayListOf<Car>()
            for (position in carNames.indices) {
                val car = Car()
                car.name = carNames[position]
                car.detail = carDetails[position]
                car.photo = carImages[position]
                car.year = carYear[position]
                car.youtube = carYoutube[position]
                list.add(car)
            }
            return list
        }
}