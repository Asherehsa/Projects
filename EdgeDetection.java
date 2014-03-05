    public void edgeDetection(int edgeDist)
    {
        Pixel currentPixel = null;
        Pixel rightPixel = null;
        Pixel bottomPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Color rightColor = null;
        Color bottomColor = null;
        for (int row = 0; row < pixels.length -1; row++)
        {
            for (int col = 0;
                 col < pixels[0].length-1; col++)
            {
                currentPixel = pixels[row][col];
                rightPixel = pixels[row][col+1];
                bottomPixel = pixels[row+1][col];

                rightColor = rightPixel.getColor();
                bottomColor = bottomPixel.getColor();
                if (currentPixel.colorDistance(rightColor) > edgeDist ||
                        currentPixel.colorDistance(bottomColor) > edgeDist
                        )
                    currentPixel.setColor(Color.BLACK);
                else
                    currentPixel.setColor(Color.WHITE);
            }
        }
    }