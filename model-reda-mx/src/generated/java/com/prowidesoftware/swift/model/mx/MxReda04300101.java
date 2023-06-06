
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
 * Class for reda.043.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ptyAudtTrlRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.043.001.01")
public class MxReda04300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PtyAudtTrlRpt", required = true)
    protected PartyAuditTrailReportV01 ptyAudtTrlRpt;
    public static final transient String BUSINESS_PROCESS = "reda";
    public static final transient int FUNCTIONALITY = 43;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, AddressType3Choice.class, CodeOrProprietary1Choice.class, Contact5 .class, DatePeriod2 .class, DatePeriod3Choice.class, ErrorHandling3Choice.class, ErrorHandling5 .class, GenericIdentification13 .class, GenericIdentification30 .class, GenericIdentification36 .class, LockStatus1Code.class, MarketSpecificAttribute1 .class, MessageHeader12 .class, MxReda04300101 .class, NameAndAddress5 .class, NamePrefix2Code.class, OriginalBusinessInstruction1 .class, OtherContact1 .class, PartyAuditTrail1 .class, PartyAuditTrailOrError1Choice.class, PartyAuditTrailOrError2Choice.class, PartyAuditTrailReport3 .class, PartyAuditTrailReportV01 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PartyLockStatus1 .class, PartyName4 .class, PostalAddress1 .class, PostalAddress25 .class, PreferredContactMethod1Code.class, ResidenceType1Code.class, Restriction1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class, SystemPartyType1Choice.class, TechnicalIdentification2Choice.class, UpdateLogAddress1 .class, UpdateLogContact1 .class, UpdateLogDate1 .class, UpdateLogMarketSpecificAttribute1 .class, UpdateLogPartyLockStatus1 .class, UpdateLogPartyName1 .class, UpdateLogPartyRecord1Choice.class, UpdateLogProprietary1 .class, UpdateLogResidenceType1 .class, UpdateLogRestriction1 .class, UpdateLogSystemPartyType1 .class, UpdateLogTechnicalAddress1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.043.001.01";

    public MxReda04300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda04300101(final String xml) {
        this();
        MxReda04300101 tmp = parse(xml);
        ptyAudtTrlRpt = tmp.getPtyAudtTrlRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda04300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ptyAudtTrlRpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAuditTrailReportV01 }
     *     
     */
    public PartyAuditTrailReportV01 getPtyAudtTrlRpt() {
        return ptyAudtTrlRpt;
    }

    /**
     * Sets the value of the ptyAudtTrlRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAuditTrailReportV01 }
     *     
     */
    public MxReda04300101 setPtyAudtTrlRpt(PartyAuditTrailReportV01 value) {
        this.ptyAudtTrlRpt = value;
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
    public static MxReda04300101 parse(String xml) {
        return ((MxReda04300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda04300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda04300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda04300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda04300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda04300101 parse(String xml, MxRead parserImpl) {
        return ((MxReda04300101) parserImpl.read(MxReda04300101 .class, xml, _classes));
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
     * Creates an MxReda04300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda04300101 message
     * @return
     *     a new instance of MxReda04300101
     */
    public static final MxReda04300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda04300101 .class);
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
