package translate;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

public class ClipboradUtils {

    protected static String getClipboardText() throws Exception{
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();//��ȡϵͳ������
        // ��ȡ���а��е�����
        Transferable clipT = clip.getContents(null);
        if (clipT != null) {
        // ��������Ƿ����ı�����
        if (clipT.isDataFlavorSupported(DataFlavor.stringFlavor))
        return (String)clipT.getTransferData(DataFlavor.stringFlavor); 
        }
        return null;
    }
}
