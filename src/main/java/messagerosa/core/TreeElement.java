package messagerosa.core;

import messagerosa.core.models.AbstractTreeElement;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Externalizable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class TreeElement implements AbstractTreeElement {

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public boolean isChildable() {
        return false;
    }

    @Override
    public String getInstanceName() {
        return null;
    }

    @Override
    public AbstractTreeElement getChild(String name, int multiplicity) {
        return null;
    }

    @Override
    public List getChildrenWithName(String name) {
        return null;
    }

    @Override
    public boolean hasChildren() {
        return false;
    }

    @Override
    public int getNumChildren() {
        return 0;
    }

    @Override
    public AbstractTreeElement getChildAt(int i) {
        return null;
    }

    @Override
    public boolean isRepeatable() {
        return false;
    }

    @Override
    public boolean isAttribute() {
        return false;
    }

    @Override
    public int getChildMultiplicity(String name) {
        return 0;
    }

    @Override
    public int getAttributeCount() {
        return 0;
    }

    @Override
    public String getAttributeNamespace(int index) {
        return null;
    }

    @Override
    public String getAttributeName(int index) {
        return null;
    }

    @Override
    public String getAttributeValue(int index) {
        return null;
    }

    @Override
    public AbstractTreeElement getAttribute(String namespace, String name) {
        return null;
    }

    @Override
    public String getAttributeValue(String namespace, String name) {
        return null;
    }

    @Override
    public int getDepth() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getMult() {
        return 0;
    }

    @Override
    public AbstractTreeElement getParent() {
        return null;
    }

    @Override
    public int getDataType() {
        return 0;
    }

    @Override
    public void clearCaches() {

    }

    @Override
    public boolean isRelevant() {
        return false;
    }

    @Override
    public String getNamespace() {
        return null;
    }
}