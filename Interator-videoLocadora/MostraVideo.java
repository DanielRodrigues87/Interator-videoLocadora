public class MostraVideo {
    public static void main(String[] args) {
        VideoItem[] videoItens = new VideoItem[5];

        videoItens[0] = new VideoItem("Batman", 2.5);
        videoItens[1] = new VideoItem("Era uma vez no oeste ", 1.5);
        videoItens[2] = new VideoItem("Gladiador", 1.5);
        videoItens[3] = new VideoItem("Scarface", 2.5);
        videoItens[4] = new VideoItem("Touro indomável", 2.5);

        Iterator videoIterator = new VideoIterator(videoItens);

        while (videoIterator.hasNext()) {
            VideoItem videoItem = (VideoItem)videoIterator.next();
            System.out.println(videoItem.nome + "=R$" + videoItem.preco);
        }
    }
}
