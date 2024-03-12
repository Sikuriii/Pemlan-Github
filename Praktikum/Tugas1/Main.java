package Praktikum.Tugas1;


public class Main {
    public static void main(String[] args) {
        Buku.Tipe[] genre = {
            Buku.Tipe.TEKNOLOGI,
            Buku.Tipe.FILSAFAT,
            Buku.Tipe.SEJARAH,
            Buku.Tipe.AGAMA,
            Buku.Tipe.PSIKOLOGI,
            Buku.Tipe.POLITIK,
            Buku.Tipe.FIKSI,
        };
        String[][] infoBuku = {
            {"The Innovators: How a Group of Hackers, Geniuses, and Geeks Created the Digital Revolution", "Walter Isaacson"},
            {"Elon Musk: Tesla, SpaceX, and the Quest for a Fantastic Future", "Ashlee Vance"},
            {"Sapiens: A Brief History of Humankind", "Yuval Noah Harari"},
            {"The Singularity Is Near: When Humans Transcend Biology", "Ray Kurzweil"},
            {"The Code Book: The Science of Secrecy from Ancient Egypt to Quantum Cryptography", "Simon Singh"},

            {"Sophie's World", "Jostein Gaarder"},
            {"Meditations", "Marcus Aurelius"},
            {"The Republic", "Plato"},
            {"Thus Spoke Zarathustra", "Friedrich Nietzsche"},
            {"Critique of Pure Reason", "Immanuel Kant"},

            {"Guns, Germs, and Steel: The Fates of Human Societies", "Jared Diamond"},
            {"A People's History of the United States", "Howard Zinn"},
            {"The Silk Roads: A New History of the World", "Peter Frankopan"},
            {"1491: New Revelations of the Americas Before Columbus", "Charles C. Mann"},
            {"The Rise and Fall of the Third Reich", "William L. Shirer"},

            {"The Holy Bible", "Various Authors"},
            {"The Qur'an", "Various Authors"},
            {"Bhagavad Gita", "Various Authors"},
            {"Tao Te Ching", "Laozi"},
            {"The Tibetan Book of Living and Dying", "Sogyal Rinpoche"},

            {"Man's Search for Meaning", "Viktor E. Frankl"},
            {"Thinking, Fast and Slow", "Daniel Kahneman"},
            {"The Power of Habit: Why We Do What We Do in Life and Business", "Charles Duhigg"},
            {"The Man Who Mistook His Wife for a Hat and Other Clinical Tales", "Oliver Sacks"},
            {"Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain"},

            {"The Prince", "Niccolò Machiavelli"},
            {"The Communist Manifesto", "Karl Marx and Friedrich Engels"},
            {"The Federalist Papers", "Alexander Hamilton, James Madison, and John Jay"},
            {"The Audacity of Hope: Thoughts on Reclaiming the American Dream", "Barack Obama"},
            {"Democracy in America", "Alexis de Tocqueville"},

            {"1984", "George Orwell"},
            {"To Kill a Mockingbird", "Harper Lee"},
            {"The Great Gatsby", "F. Scott Fitzgerald"},
            {"The Catcher in the Rye", "J.D. Salinger"},
            {"One Hundred Years of Solitude", "Gabriel García Márquez"}
        };

        Perpustakaan perpustakaan = new Perpustakaan("UB");

        for (int i = 0; i < infoBuku.length; i++) {
            int j = i % genre.length;
            Buku bukuBaru = new Buku(infoBuku[i][0], infoBuku[i][1], genre[j]);
            perpustakaan.tambahBuku(bukuBaru);
        }

        perpustakaan.displayInfoBuku();
        perpustakaan.displaySemuaBuku();
    }
}
