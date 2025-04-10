
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
 * Class for auth.076.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finSprvsdPtyIdntyRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.076.001.01")
public class MxAuth07600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FinSprvsdPtyIdntyRpt", required = true)
    protected FinancialSupervisedPartyIdentityReportV01 finSprvsdPtyIdntyRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 76;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, CommunicationAddress7 .class, FinancialSupervisedPartyIdentityReportV01 .class, GenericIdentification36 .class, MxAuth07600101 .class, NameAndAddress5 .class, PartyCancellation1 .class, PartyDetail1 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PartyReport1Choice.class, PartyUpdate1 .class, Period2 .class, Period4Choice.class, PostalAddress1 .class, PostalAddress6 .class, StatusDetail1 .class, SupervisingAuthorityIdentification1 .class, SupervisingAuthorityIdentification1Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.076.001.01";

    public MxAuth07600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth07600101(final String xml) {
        this();
        MxAuth07600101 tmp = parse(xml);
        finSprvsdPtyIdntyRpt = tmp.getFinSprvsdPtyIdntyRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth07600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finSprvsdPtyIdntyRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialSupervisedPartyIdentityReportV01 }
     *     
     */
    public FinancialSupervisedPartyIdentityReportV01 getFinSprvsdPtyIdntyRpt() {
        return finSprvsdPtyIdntyRpt;
    }

    /**
     * Sets the value of the finSprvsdPtyIdntyRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialSupervisedPartyIdentityReportV01 }
     *     
     */
    public MxAuth07600101 setFinSprvsdPtyIdntyRpt(FinancialSupervisedPartyIdentityReportV01 value) {
        this.finSprvsdPtyIdntyRpt = value;
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
    public static MxAuth07600101 parse(String xml) {
        return ((MxAuth07600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth07600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth07600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth07600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth07600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth07600101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth07600101) parserImpl.read(MxAuth07600101 .class, xml, _classes));
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
     * Creates an MxAuth07600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth07600101 message
     * @return
     *     a new instance of MxAuth07600101
     */
    public static final MxAuth07600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth07600101 .class);
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
