
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
 * Reports on members.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberInformation", propOrder = {
    "mmbRpt"
})
public class MemberInformation {

    @XmlElement(name = "MmbRpt", required = true)
    protected List<MemberReport> mmbRpt;

    /**
     * Gets the value of the mmbRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mmbRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMmbRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberReport }
     * 
     * 
     * @return
     *     The value of the mmbRpt property.
     */
    public List<MemberReport> getMmbRpt() {
        if (mmbRpt == null) {
            mmbRpt = new ArrayList<>();
        }
        return this.mmbRpt;
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
     * Adds a new item to the mmbRpt list.
     * @see #getMmbRpt()
     * 
     */
    public MemberInformation addMmbRpt(MemberReport mmbRpt) {
        getMmbRpt().add(mmbRpt);
        return this;
    }

}
