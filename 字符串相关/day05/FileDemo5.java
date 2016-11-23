package day05;

import java.io.File;  

public class FileDemo5 {  
    /** 
     * ͨ������ϵͳ����ɾ��һ���ļ��м�����������ļ� 
     * @param file 
     */  
    public static void deleteFileByWinCom(File file){  
        Runtime rt = Runtime.getRuntime();  
        String cmd = null;  
        try{  
            if(file.isFile()){  
                cmd = "cmd.exe /c del /q/a/f/s "+file.getAbsolutePath();  
            }else{  
                cmd = "cmd.exe /c rd /s/q "+file.getAbsolutePath();  
            }  
            rt.exec(cmd);  
            System.out.println("�ɹ�ִ��������...");  
        }catch(Exception e){  
            System.out.println("����ϵͳ����ʧ����...");  
        }  
    }  
      
    /** 
     * ͨ���ݹ����ɾ��һ���ļ��м�����������ļ� 
     * @param file 
     */  
    public static void deleteFile(File file){  
        if(file.isFile()){//��ʾ���ļ������ļ���  
            file.delete();  
        }else{  
            //���ȵõ���ǰ��·��  
            String[] childFilePaths = file.list();  
            for(String childFilePath : childFilePaths){  
                File childFile=new File(file.getAbsolutePath()+"\\"+childFilePath);  
                deleteFile(childFile);  
            }  
            file.delete();  
        }  
    }  
      
    public static void main(String[] args){  
        File file=new File("D:\\demo");  
        //deleteFileByWinCom(file);  
        deleteFile(file);  
    }  
}