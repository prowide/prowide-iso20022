
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Reports on limits.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Limits1", propOrder = {
    "curLmt",
    "dfltLmt"
})
public class Limits1 {

    @XmlElement(name = "CurLmt")
    protected List<LimitReport1> curLmt;
    @XmlElement(name = "DfltLmt")
    protected List<LimitReport1> dfltLmt;

    /**
     * Gets the value of the curLmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the curLmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurLmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitReport1 }
     * 
     * 
     * @return
     *     The value of the curLmt property.
     */
    public List<LimitReport1> getCurLmt() {
        if (curLmt == null) {
            curLmt = new ArrayList<>();
        }
        return this.curLmt;
    }

    /**
     * Gets the value of the dfltLmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dfltLmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDfltLmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitReport1 }
     * 
     * 
     * @return
     *     The value of the dfltLmt property.
     */
    public List<LimitReport1> getDfltLmt() {
        if (dfltLmt == null) {
            dfltLmt = new ArrayList<>();
        }
        return this.dfltLmt;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the curLmt list.
     * @see #getCurLmt()
     * 
     */
    public Limits1 addCurLmt(LimitReport1 curLmt) {
        getCurLmt().add(curLmt);
        return this;
    }

    /**
     * Adds a new item to the dfltLmt list.
     * @see #getDfltLmt()
     * 
     */
    public Limits1 addDfltLmt(LimitReport1 dfltLmt) {
        getDfltLmt().add(dfltLmt);
        return this;
    }

}
