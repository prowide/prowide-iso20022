
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.023.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "bckpPmt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.023.001.05")
public class MxCamt02300105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BckpPmt", required = true)
    protected BackupPaymentV05 bckpPmt;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 23;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, Amount2Choice.class, BackupPaymentV05 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, FinancialIdentificationSchemeName1Choice.class, GenericFinancialIdentification1 .class, MarketInfrastructureIdentification1Choice.class, MemberIdentification2Choice.class, MessageHeader1 .class, MxCamt02300105 .class, PaymentInstruction13 .class, PaymentType3Code.class, PaymentType4Choice.class, SystemIdentification2Choice.class, SystemMember2 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.023.001.05";

    public MxCamt02300105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02300105(final String xml) {
        this();
        MxCamt02300105 tmp = parse(xml);
        bckpPmt = tmp.getBckpPmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02300105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the bckpPmt property.
     * 
     * @return
     *     possible object is
     *     {@link BackupPaymentV05 }
     *     
     */
    public BackupPaymentV05 getBckpPmt() {
        return bckpPmt;
    }

    /**
     * Sets the value of the bckpPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackupPaymentV05 }
     *     
     */
    public MxCamt02300105 setBckpPmt(BackupPaymentV05 value) {
        this.bckpPmt = value;
        return this;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt02300105 parse(String xml) {
        return ((MxCamt02300105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02300105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt02300105 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt02300105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02300105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02300105 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02300105) parserImpl.read(MxCamt02300105 .class, xml, _classes));
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
     * Creates an MxCamt02300105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02300105 message
     * @return
     *     a new instance of MxCamt02300105
     */
    public static final MxCamt02300105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02300105 .class);
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

}
