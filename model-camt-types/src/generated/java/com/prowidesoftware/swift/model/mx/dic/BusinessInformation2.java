
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Reports on business information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessInformation2", propOrder = {
    "gnlBizRpt"
})
public class BusinessInformation2 {

    @XmlElement(name = "GnlBizRpt", required = true)
    protected List<GeneralBusinessReport2> gnlBizRpt;

    /**
     * Gets the value of the gnlBizRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gnlBizRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGnlBizRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralBusinessReport2 }
     * 
     * 
     */
    public List<GeneralBusinessReport2> getGnlBizRpt() {
        if (gnlBizRpt == null) {
            gnlBizRpt = new ArrayList<GeneralBusinessReport2>();
        }
        return this.gnlBizRpt;
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
     * Adds a new item to the gnlBizRpt list.
     * @see #getGnlBizRpt()
     * 
     */
    public BusinessInformation2 addGnlBizRpt(GeneralBusinessReport2 gnlBizRpt) {
        getGnlBizRpt().add(gnlBizRpt);
        return this;
    }

}
