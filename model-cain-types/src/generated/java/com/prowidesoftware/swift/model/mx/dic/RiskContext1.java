
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
 * Context of the risk associated with the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskContext1", propOrder = {
    "rskInptData",
    "rskAssmnt"
})
public class RiskContext1 {

    @XmlElement(name = "RskInptData")
    protected List<RiskInputData1> rskInptData;
    @XmlElement(name = "RskAssmnt")
    protected List<RiskAssessment1> rskAssmnt;

    /**
     * Gets the value of the rskInptData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rskInptData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRskInptData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskInputData1 }
     * 
     * 
     */
    public List<RiskInputData1> getRskInptData() {
        if (rskInptData == null) {
            rskInptData = new ArrayList<RiskInputData1>();
        }
        return this.rskInptData;
    }

    /**
     * Gets the value of the rskAssmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rskAssmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRskAssmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskAssessment1 }
     * 
     * 
     */
    public List<RiskAssessment1> getRskAssmnt() {
        if (rskAssmnt == null) {
            rskAssmnt = new ArrayList<RiskAssessment1>();
        }
        return this.rskAssmnt;
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
     * Adds a new item to the rskInptData list.
     * @see #getRskInptData()
     * 
     */
    public RiskContext1 addRskInptData(RiskInputData1 rskInptData) {
        getRskInptData().add(rskInptData);
        return this;
    }

    /**
     * Adds a new item to the rskAssmnt list.
     * @see #getRskAssmnt()
     * 
     */
    public RiskContext1 addRskAssmnt(RiskAssessment1 rskAssmnt) {
        getRskAssmnt().add(rskAssmnt);
        return this;
    }

}
