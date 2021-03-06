package com.paz.gigs.utils

object Consts {
    const val AF_DEEP_LINK = "af_deepLink"
    const val AF_DEEP_LINK_VALUE = "AF_dpValue"
    const val SAVED_EVENTS_KEY = "eventsUUID"
    const val GENRES_LIST = "Genres_list"
    const val DEFAULT_SLIDER_VALUE = "Default_slider_value"
    const val EVENT_KEY = "event_info_json"
    const val LAST_LOCATION = "last_location_key"
    const val LOCATION_UPDATE = "location_update_key"
    const val LAT = "lat_key"
    const val LNG = "lng_key"
    const val GENRES = "genres"
    const val DEF_INTERFACE = "def_interface"
    const val USER_TYPES = "user_type"
    const val USER_ID = "user_uuid"
    const val SONG_KEY = "song"
    const val REGISTER_KEY = "isUserRegistered"
    const val DJ_INTERFACE = 222
    const val PR_INTERFACE = 333
    const val CLUBBER_INTERFACE = 444
    val MUSIC_GENRES_MAP = mapOf(
        "Pop" to arrayOf(
            "Pop",
            "Acoustic Pop",
            "Arab Pop",
            "Art Pop",
            "C-Pop",
            "Classify",
            "Dance Pop",
            "Electropop",
            "Escape Room",
            "Europop",
            "Hip Pop",
            "Hyperpop",
            "Indie Cafe Pop",
            "Indie Electropop",
            "Indie Pop",
            "Indie Poptimism",
            "J-Pop",
            "K-Pop",
            "Latin Pop",
            "Levenslied",
            "Metropopolis",
            "Mexican Pop",
            "Neo Mellow",
            "New Romantic",
            "New Wave Pop",
            "Pop Dance",
            "Pop Edm",
            "Pop R&B",
            "Pop Rap",
            "Pop Rock",
            "Post-Teen Pop",
            "Social Media Pop",
            "Soft Rock",
            "Sophisti-Pop",
            "Talent Show",
            "Teen Pop",
            "Turkish Pop",
            "Vapor Soul",
            "Viral Pop",
            "Vispop",

            ),
        "Dance / EDM" to arrayOf(
            "Edm",
            "Bass House",
            "Bass Trap",
            "Big Room",
            "Breakbeat",
            "Breakcore",
            "Brostep",
            "Chillstep",
            "Complextro",
            "Deep Big Room",
            "Deep Groove House",
            "Deep House",
            "Deep Tropical House",
            "Disco House",
            "Dubstep",
            "Electro House",
            "Electronic Trap",
            "Electropop",
            "Electro Swing",
            "Filthstep",
            "Future Bass",
            "Future Garage",
            "Future House",
            "Gaming Dubstep",
            "Gaming Edm",
            "Glitch Hop",
            "House",
            "Indie Electropop",
            "Melodic Dubstep",
            "Pop Dance",
            "Pop Edm",
            "Progressive Electro House",
            "Progressive House",
            "Progressive Trance",
            "Sky Room",
            "Tech House",
            "Trance",
            "Tropical House",
            "Uplifting Trance",
            "Vapor Soul",
            "Vapor Twitch",
            "Vocal House",
        ), "Hip-hop and Rap" to arrayOf(
            "Hip Hop",
            "Rap",
            "Alternative Hip Hop",
            "Atl Hip Hop",
            "Atl Trap",
            "Bounce",
            "Chicago Rap",
            "Christian Hip Hop",
            "Conscious Hip Hop",
            "Country Rap",
            "Crunk",
            "Dirty South Rap",
            "East Coast Hip Hop",
            "Electro",
            "Gangster Rap",
            "G Funk",
            "Hardcore Hip Hop",
            "Hyphy",
            "Industrial Hip Hop",
            "Jazz Rap",
            "Melodic Rap",
            "Nerdcore",
            "Old School Hip Hop",
            "Pop Rap",
            "Queens Hip Hop",
            "Southern Hip Hop",
            "Trap",
            "Underground Hip Hop",
            "Vapor Trap",
            "West Coast Rap",
        ), "R&B" to arrayOf(
            "R&B",
            "Alternative R&B",
            "Disco",
            "Funk",
            "Gospel R&B",
            "Indie R&B",
            "Indie Soul",
            "Motown",
            "Neo R&B",
            "Neo Soul",
            "New Jack Swing",
            "Pop R&B",
            "Pop Soul",
            "Quiet Storm",
            "Soul",
            "Trap Soul",
            "Urban Contemporary",
        ), "Latin" to arrayOf(
            "Latin",
            "Bachata",
            "Bachata Dominicana",
            "Bolero",
            "Bossa Nova",
            "Chicha",
            "Colombian Pop",
            "Cumbia",
            "Dominican Pop",
            "Flamenco",
            "Huayno",
            "Latin Alternative",
            "Latin Arena Pop",
            "Latin Hip Hop",
            "Latin Jazz",
            "Latin Pop",
            "Latin Rock",
            "Mariachi",
            "Merengue",
            "Mexican Pop",
            "Neotango",
            "Nuevo Flamenco",
            "Perreo",
            "Pop Reggaeton",
            "Puerto Rican Pop",
            "Ranchera",
            "Reggaeton",
            "Reggaeton Colombiano",
            "Reggaeton Flow",
            "Rock En Espanol",
            "Salsa",
            "Spanish Pop",
            "Spanish Pop Rock",
            "Tango",
            "Tejano",
            "Timba",
            "Trap Latino",
            "Tropical",
            "Twoubadou",
            "Zouk",
        ), "Rock" to arrayOf(
            "Rock",
            "Acid Rock",
            "Album Rock",
            "Alternative Rock",
            "Art Rock",
            "Blues Rock",
            "British Invasion",
            "Britpop",
            "Classic Rock",
            "Dance-Punk",
            "Dance Rock",
            "Garage Rock",
            "Glam Rock",
            "Grunge",
            "Heartland Rock",
            "Indie Rock",
            "Math Rock",
            "Mellow Gold",
            "Metalc",
            "Modern Alternative Rok",
            "Modern Blues Rock",
            "Modern Rock",
            "New Romantic",
            "New Wave",
            "Noise Rock",
            "Permanent Wave",
            "Post-Grunge",
            "Psychedelic Rock",
            "Rock-And-Roll",
            "Rockabilly",
            "Roots Rock",
            "Soft Rock",
            "Southern Rock",
            "Symphonic Rock",
        ), "Metal" to arrayOf(
            "Metal",
            "Alternative Metal",
            "Black Metal",
            "Brutal Death Metal",
            "Crossover Thrash",
            "Dark Black Metal",
            "Death Metal",
            "Doom Metal",
            "Folk Metal",
            "German Metal",
            "German Power Metal",
            "Glam Metal",
            "Gothic Metal",
            "Groove Metal",
            "Hard Rock",
            "Melodic Death Metal",
            "Melodic Metal",
            "Neo-Trad Metal",
            "Neo Classical Metal",
            "Nu Metal",
            "Nwothm",
            "Old School Thrash",
            "Power Metal",
            "Progressive Metal",
            "Speed Metal",
            "Swedish Metal",
            "Symphonic Black Metal",
            "Symphonic Metal",
            "Technical Death Metal",
            "Thrash Metal",
            "Us Power Metal",
        ), "Country" to arrayOf(
            "Country",
            "Alberta Country",
            "Alternative Country",
            "Australian Country",
            "Bakersfield Sound",
            "Bluegrass",
            "Bluegrass Gospel",
            "Cajun",
            "Classic Country Pop",
            "Contemporary Country",
            "Country Dawn",
            "Country Gospel",
            "Country Pop",
            "Country Rap",
            "Country Road",
            "Country Rock",
            "Cowboy Western",
            "Cowpunk",
            "Dansband",
            "Honky Tonk",
            "Kentucky Roots",
            "Modern Country Rock",
            "Nashville Sound",
            "Neo-Traditional Bluegrass",
            "Neo-Traditional Country",
            "New Americana",
            "Oklahoma Country",
            "Outlaw Country",
            "Progressive Bluegrass",
            "Queer Country",
            "Red Dirt",
            "Sertanejo",
            "Texas Country",
            "Traditional Bluegrass",
            "Traditional Country",
            "Truck-Driving Country",
            "Western Swing",
            "Wyoming Roots",
        ), "Classical" to arrayOf(
            "Classical",
            "Avant-Garde",
            "Baroque",
            "Chamber Ensemble",
            "Chamber Orchestra",
            "Choral",
            "Classical Cello",
            "Classical Era",
            "Classical Guitar",
            "Classical Piano",
            "Classical Soprano",
            "Compositional Ambient",
            "Contemporary Classical",
            "Early Modern Classical",
            "Early Music",
            "Early Music Choir",
            "Early Music Ensemble",
            "Early Romantic Era",
            "Historically Informed Performance",
            "Impressionism",
            "Italian Baroque",
            "Late Romantic Era",
            "Medieval",
            "Minimalism",
            "Neoclassicism",
            "Opera",
            "Orchestra",
            "Polyphony",
            "Post-Romantic Era",
            "Renaissance",
            "Serialism",
            "String Quartet",
            "Violin",
        ),
        "Jazz" to arrayOf(
            "Jazz",
            "Acid Jazz",
            "Avant-Garde Jazz",
            "Bebop",
            "Bossa Nova",
            "Classical Jazz Fusion",
            "Contemporary Jazz",
            "Contemporary Post-Bop",
            "Cool Jazz",
            "Dixieland",
            "Ecm-Style Jazz",
            "Ethio-Jazz",
            "Free Improvisation",
            "Free Jazz",
            "Gypsy Jazz",
            "Hard Bop",
            "Harlem Renaissance",
            "Indie Jazz",
            "Jazz Clarinet",
            "Jazz Double Bass",
            "Jazz Drums",
            "Jazz Funk",
            "Jazz Fusion",
            "Jazz Guitar",
            "Jazz Piano",
            "Jazz Quartet",
            "Jazz Saxophone",
            "Jazz Trio",
            "Jazz Trumpet",
            "Jazz Vibraphone",
            "Latin Jazz",
            "Modern Jazz Piano",
            "Ragtime",
            "Samba-Jazz",
            "Smooth Jazz",
            "Soul Jazz",
            "Spiritual Jazz",
            "Straight-Ahead Jazz",
            "Stride",
            "Vintage Jazz",
            "Vocal Jazz",
        ), "Blues" to arrayOf(
            "Blues",
            "Acoustic Blues",
            "Blues Rock",
            "British Blues",
            "Canadian Blues",
            "Chicago Blues",
            "Country Blues",
            "Delta Blues",
            "Electric Blues",
            "Gospel Blues",
            "Harmonica Blues",
            "Jazz Blues",
            "Jump Blues",
            "Louisiana Blues",
            "Memphis Blues",
            "Modern Blues",
            "New Orleans Blues",
            "Piano Blues",
            "Piedmont Blues",
            "Power Blues-Rock",
            "Pre-War Blues",
            "Punk Blues",
            "Rhythm And Blues",
            "Soul Blues",
            "Swamp Blues",
            "Texas Blues",
            "Traditional Blues",
        )


    )


}
