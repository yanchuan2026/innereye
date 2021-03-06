package org.innereye.ms.compress.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.innereye.ms.compress.Compress;
import org.innereye.ms.compress.support.SPI;

/**
 * The Data Compression Based on bzip2.
 */
@SPI("bzip2")
public class Bzip2Compress implements Compress {

    @Override
    public byte[] compress(byte[] data) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        BZip2CompressorOutputStream bcos = new BZip2CompressorOutputStream(out);
        bcos.write(data);
        bcos.close();
        return out.toByteArray();
    }

    @Override
    public byte[] uncompress(byte[] data) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        try {
            @SuppressWarnings("resource")
            BZip2CompressorInputStream ungzip = new BZip2CompressorInputStream(in);
            byte[] buffer = new byte[2048];
            int n;
            while ((n = ungzip.read(buffer)) >= 0) {
                out.write(buffer, 0, n);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return out.toByteArray();
    }
}
