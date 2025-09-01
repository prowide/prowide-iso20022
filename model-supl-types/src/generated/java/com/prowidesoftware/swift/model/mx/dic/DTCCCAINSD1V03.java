
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
 * The DTCCCAINSD1 message extends ISO corporate action instruction message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCAINSD1V03", propOrder = {
    "optnlDvdd",
    "taxXmpt",
    "wireInstr",
    "sctiesQtyDtls"
})
public class DTCCCAINSD1V03 {

    @XmlElement(name = "OptnlDvdd")
    protected List<OptionalDividendAccountQuantitySD2> optnlDvdd;
    @XmlElement(name = "TaxXmpt")
    protected List<TaxExemptQuantitySD1> taxXmpt;
    @XmlElement(name = "WireInstr")
    protected List<WireInstructionSD2> wireInstr;
    @XmlElement(name = "SctiesQtyDtls")
    protected SecuritiesQuantityDetailsSD1 sctiesQtyDtls;

    /**
     * Gets the value of the optnlDvdd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optnlDvdd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnlDvdd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionalDividendAccountQuantitySD2 }
     * 
     * 
     */
    public List<OptionalDividendAccountQuantitySD2> getOptnlDvdd() {
        if (optnlDvdd == null) {
            optnlDvdd = new ArrayList<OptionalDividendAccountQuantitySD2>();
        }
        return this.optnlDvdd;
    }

    /**
     * Gets the value of the taxXmpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxXmpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxXmpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxExemptQuantitySD1 }
     * 
     * 
     */
    public List<TaxExemptQuantitySD1> getTaxXmpt() {
        if (taxXmpt == null) {
            taxXmpt = new ArrayList<TaxExemptQuantitySD1>();
        }
        return this.taxXmpt;
    }

    /**
     * Gets the value of the wireInstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wireInstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWireInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WireInstructionSD2 }
     * 
     * 
     */
    public List<WireInstructionSD2> getWireInstr() {
        if (wireInstr == null) {
            wireInstr = new ArrayList<WireInstructionSD2>();
        }
        return this.wireInstr;
    }

    /**
     * Gets the value of the sctiesQtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesQuantityDetailsSD1 }
     *     
     */
    public SecuritiesQuantityDetailsSD1 getSctiesQtyDtls() {
        return sctiesQtyDtls;
    }

    /**
     * Sets the value of the sctiesQtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesQuantityDetailsSD1 }
     *     
     */
    public DTCCCAINSD1V03 setSctiesQtyDtls(SecuritiesQuantityDetailsSD1 value) {
        this.sctiesQtyDtls = value;
        return this;
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
     * Adds a new item to the optnlDvdd list.
     * @see #getOptnlDvdd()
     * 
     */
    public DTCCCAINSD1V03 addOptnlDvdd(OptionalDividendAccountQuantitySD2 optnlDvdd) {
        getOptnlDvdd().add(optnlDvdd);
        return this;
    }

    /**
     * Adds a new item to the taxXmpt list.
     * @see #getTaxXmpt()
     * 
     */
    public DTCCCAINSD1V03 addTaxXmpt(TaxExemptQuantitySD1 taxXmpt) {
        getTaxXmpt().add(taxXmpt);
        return this;
    }

    /**
     * Adds a new item to the wireInstr list.
     * @see #getWireInstr()
     * 
     */
    public DTCCCAINSD1V03 addWireInstr(WireInstructionSD2 wireInstr) {
        getWireInstr().add(wireInstr);
        return this;
    }

}
