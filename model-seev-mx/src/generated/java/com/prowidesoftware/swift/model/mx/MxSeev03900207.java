
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
 * Class for seev.039.002.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnCxlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.039.002.07")
public class MxSeev03900207
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnCxlAdvc", required = true)
    protected CorporateActionCancellationAdvice002V07 corpActnCxlAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 39;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification10 .class, AccountIdentification34 .class, AccountIdentification34Choice.class, CorporateAction35 .class, CorporateActionCancellation4 .class, CorporateActionCancellationAdvice002V07 .class, CorporateActionCancellationReason1Code.class, CorporateActionDate50 .class, CorporateActionEventStage4Code.class, CorporateActionEventStageFormat15Choice.class, CorporateActionEventStatus1 .class, CorporateActionEventType22Code.class, CorporateActionEventType57Choice.class, CorporateActionGeneralInformation120 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary4Choice.class, DateAndDateTimeChoice.class, DateCode22Choice.class, DateFormat34Choice.class, DateType8Code.class, EventCompletenessStatus1Code.class, EventConfirmationStatus1Code.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, IdentificationSource4Choice.class, LotteryType1Code.class, LotteryTypeFormat5Choice.class, MxSeev03900207 .class, NameAndAddress12 .class, OtherIdentification2 .class, PartyIdentification103Choice.class, PartyIdentification104Choice.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat11Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText9 .class, SecurityIdentification20 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.039.002.07";

    public MxSeev03900207() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03900207(final String xml) {
        this();
        MxSeev03900207 tmp = parse(xml);
        corpActnCxlAdvc = tmp.getCorpActnCxlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03900207(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnCxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionCancellationAdvice002V07 }
     *     
     */
    public CorporateActionCancellationAdvice002V07 getCorpActnCxlAdvc() {
        return corpActnCxlAdvc;
    }

    /**
     * Sets the value of the corpActnCxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionCancellationAdvice002V07 }
     *     
     */
    public MxSeev03900207 setCorpActnCxlAdvc(CorporateActionCancellationAdvice002V07 value) {
        this.corpActnCxlAdvc = value;
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
    public static MxSeev03900207 parse(String xml) {
        return ((MxSeev03900207) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03900207 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03900207 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03900207) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03900207 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03900207 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03900207) parserImpl.read(MxSeev03900207 .class, xml, _classes));
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
     * Creates an MxSeev03900207 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03900207 message
     * @return
     *     a new instance of MxSeev03900207
     */
    public static final MxSeev03900207 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03900207 .class);
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
