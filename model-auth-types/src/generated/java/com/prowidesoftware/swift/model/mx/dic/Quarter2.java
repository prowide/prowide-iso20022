
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
 * Information related with a quarter.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quarter2", propOrder = {
    "mnthInf"
})
public class Quarter2 {

    @XmlElement(name = "MnthInf", required = true)
    protected List<MonthType2> mnthInf;

    /**
     * Gets the value of the mnthInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mnthInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMnthInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonthType2 }
     * 
     * 
     */
    public List<MonthType2> getMnthInf() {
        if (mnthInf == null) {
            mnthInf = new ArrayList<MonthType2>();
        }
        return this.mnthInf;
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
     * Adds a new item to the mnthInf list.
     * @see #getMnthInf()
     * 
     */
    public Quarter2 addMnthInf(MonthType2 mnthInf) {
        getMnthInf().add(mnthInf);
        return this;
    }

}
