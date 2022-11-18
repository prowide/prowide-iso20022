
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
 * Specifies the details of the participants with the highest volume and value ranking for settlement fails.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsParticipantRange1", propOrder = {
    "hghstInVol",
    "hghstInVal"
})
public class SettlementFailsParticipantRange1 {

    @XmlElement(name = "HghstInVol", required = true)
    protected List<SettlementFailsParticipant1> hghstInVol;
    @XmlElement(name = "HghstInVal", required = true)
    protected List<SettlementFailsParticipant1> hghstInVal;

    /**
     * Gets the value of the hghstInVol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hghstInVol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHghstInVol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementFailsParticipant1 }
     * 
     * 
     */
    public List<SettlementFailsParticipant1> getHghstInVol() {
        if (hghstInVol == null) {
            hghstInVol = new ArrayList<SettlementFailsParticipant1>();
        }
        return this.hghstInVol;
    }

    /**
     * Gets the value of the hghstInVal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hghstInVal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHghstInVal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementFailsParticipant1 }
     * 
     * 
     */
    public List<SettlementFailsParticipant1> getHghstInVal() {
        if (hghstInVal == null) {
            hghstInVal = new ArrayList<SettlementFailsParticipant1>();
        }
        return this.hghstInVal;
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
     * Adds a new item to the hghstInVol list.
     * @see #getHghstInVol()
     * 
     */
    public SettlementFailsParticipantRange1 addHghstInVol(SettlementFailsParticipant1 hghstInVol) {
        getHghstInVol().add(hghstInVol);
        return this;
    }

    /**
     * Adds a new item to the hghstInVal list.
     * @see #getHghstInVal()
     * 
     */
    public SettlementFailsParticipantRange1 addHghstInVal(SettlementFailsParticipant1 hghstInVal) {
        getHghstInVal().add(hghstInVal);
        return this;
    }

}
