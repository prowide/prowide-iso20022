
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
 * Reports on business day information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDayInformation1", propOrder = {
    "bizDayInfRpt"
})
public class BusinessDayInformation1 {

    @XmlElement(name = "BizDayInfRpt", required = true)
    protected List<BusinessDayInformationReport1> bizDayInfRpt;

    /**
     * Gets the value of the bizDayInfRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bizDayInfRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBizDayInfRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDayInformationReport1 }
     * 
     * 
     */
    public List<BusinessDayInformationReport1> getBizDayInfRpt() {
        if (bizDayInfRpt == null) {
            bizDayInfRpt = new ArrayList<BusinessDayInformationReport1>();
        }
        return this.bizDayInfRpt;
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
     * Adds a new item to the bizDayInfRpt list.
     * @see #getBizDayInfRpt()
     * 
     */
    public BusinessDayInformation1 addBizDayInfRpt(BusinessDayInformationReport1 bizDayInfRpt) {
        getBizDayInfRpt().add(bizDayInfRpt);
        return this;
    }

}
