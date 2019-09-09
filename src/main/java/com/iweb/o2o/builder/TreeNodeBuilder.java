package com.iweb.o2o.builder;

import com.iweb.o2o.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/9 14:54
 * Description:
 */
public class TreeNodeBuilder {
    /**
     * 把简单的集合转成有层级关系的集合
     * @param nodes
     * @param topPid
     * @return
     */
    public static List<TreeNode> builder(List<TreeNode> nodes, Integer topPid) {
        List<TreeNode> treeNodes = new ArrayList<>();
        for (TreeNode n1 : nodes) {
            if (n1.getPid() == topPid) {
//一级菜单
                treeNodes.add(n1);
            }
            for (TreeNode n2 : nodes) {
//二级菜单
                if (n2.getPid() == n1.getId()) {
                    n1.getChildren().add(n2);
                }
            }
        }
        return treeNodes;
    }
}
