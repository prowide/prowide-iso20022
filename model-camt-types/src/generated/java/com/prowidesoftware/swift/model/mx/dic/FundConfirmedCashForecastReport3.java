
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
 * Information about a cash forecast report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundConfirmedCashForecastReport3", propOrder = {
    "fndOrSubFndDtls",
    "fndCshFcstDtls",
    "cnsltdNetCshFcst",
    "xtnsn"
})
public class FundConfirmedCashForecastReport3 {

    @XmlElement(name = "FndOrSubFndDtls")
    protected List<Fund2> fndOrSubFndDtls;
    @XmlElement(name = "FndCshFcstDtls")
    protected List<FundCashForecast7> fndCshFcstDtls;
    @XmlElement(name = "CnsltdNetCshFcst")
    protected NetCashForecast3 cnsltdNetCshFcst;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the fndOrSubFndDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fndOrSubFndDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndOrSubFndDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fund2 }
     * 
     * 
     */
    public List<Fund2> getFndOrSubFndDtls() {
        if (fndOrSubFndDtls == null) {
            fndOrSubFndDtls = new ArrayList<Fund2>();
        }
        return this.fndOrSubFndDtls;
    }

    /**
     * Gets the value of the fndCshFcstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fndCshFcstDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndCshFcstDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundCashForecast7 }
     * 
     * 
     */
    public List<FundCashForecast7> getFndCshFcstDtls() {
        if (fndCshFcstDtls == null) {
            fndCshFcstDtls = new ArrayList<FundCashForecast7>();
        }
        return this.fndCshFcstDtls;
    }

    /**
     * Gets the value of the cnsltdNetCshFcst property.
     * 
     * @return
     *     possible object is
     *     {@link NetCashForecast3 }
     *     
     */
    public NetCashForecast3 getCnsltdNetCshFcst() {
        return cnsltdNetCshFcst;
    }

    /**
     * Sets the value of the cnsltdNetCshFcst property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetCashForecast3 }
     *     
     */
    public FundConfirmedCashForecastReport3 setCnsltdNetCshFcst(NetCashForecast3 value) {
        this.cnsltdNetCshFcst = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension1>();
        }
        return this.xtnsn;
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
     * Adds a new item to the fndOrSubFndDtls list.
     * @see #getFndOrSubFndDtls()
     * 
     */
    public FundConfirmedCashForecastReport3 addFndOrSubFndDtls(Fund2 fndOrSubFndDtls) {
        getFndOrSubFndDtls().add(fndOrSubFndDtls);
        return this;
    }

    /**
     * Adds a new item to the fndCshFcstDtls list.
     * @see #getFndCshFcstDtls()
     * 
     */
    public FundConfirmedCashForecastReport3 addFndCshFcstDtls(FundCashForecast7 fndCshFcstDtls) {
        getFndCshFcstDtls().add(fndCshFcstDtls);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public FundConfirmedCashForecastReport3 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
