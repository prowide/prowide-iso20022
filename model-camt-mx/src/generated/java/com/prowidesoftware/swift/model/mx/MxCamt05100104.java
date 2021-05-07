
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.051.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "lqdtyDbtTrf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.051.001.04")
public class MxCamt05100104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "LqdtyDbtTrf", required = true)
    protected LiquidityDebitTransferV04 lqdtyDbtTrf;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 51;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, Amount2Choice.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount24 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, LiquidityDebitTransfer1 .class, LiquidityDebitTransferV04 .class, MessageHeader1 .class, MxCamt05100104 .class, PaymentIdentification1 .class, PostalAddress6 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.051.001.04";

    public MxCamt05100104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt05100104(final String xml) {
        this();
        MxCamt05100104 tmp = parse(xml);
        lqdtyDbtTrf = tmp.getLqdtyDbtTrf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt05100104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the lqdtyDbtTrf property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidityDebitTransferV04 }
     *     
     */
    public LiquidityDebitTransferV04 getLqdtyDbtTrf() {
        return lqdtyDbtTrf;
    }

    /**
     * Sets the value of the lqdtyDbtTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidityDebitTransferV04 }
     *     
     */
    public MxCamt05100104 setLqdtyDbtTrf(LiquidityDebitTransferV04 value) {
        this.lqdtyDbtTrf = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxCamt05100104 parse(String xml) {
        return ((MxCamt05100104) MxReadImpl.parse(MxCamt05100104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt05100104 parse(String xml, MxRead parserImpl) {
        return ((MxCamt05100104) parserImpl.read(MxCamt05100104 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxCamt05100104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt05100104 message
     * @return
     *     a new instance of MxCamt05100104
     */
    public final static MxCamt05100104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt05100104 .class);
    }

}
