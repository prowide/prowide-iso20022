
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
 * Class for seev.044.002.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntPrlimryAdvcCxlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.044.002.06")
public class MxSeev04400206
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntPrlimryAdvcCxlAdvc", required = true)
    protected CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 corpActnMvmntPrlimryAdvcCxlAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 44;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification10 .class, AccountIdentification34 .class, AccountIdentification34Choice.class, CorporateAction35 .class, CorporateActionDate50 .class, CorporateActionEventStage4Code.class, CorporateActionEventStageFormat15Choice.class, CorporateActionEventType18Code.class, CorporateActionEventType42Choice.class, CorporateActionGeneralInformation99 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary4Choice.class, CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 .class, DateAndDateTimeChoice.class, DateCode22Choice.class, DateFormat34Choice.class, DateType8Code.class, DocumentIdentification37 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, IdentificationSource4Choice.class, LotteryType1Code.class, LotteryTypeFormat5Choice.class, MxSeev04400206 .class, NameAndAddress12 .class, OtherIdentification2 .class, PartyIdentification103Choice.class, PartyIdentification104Choice.class, ProcessingPosition10Choice.class, ProcessingPosition3Code.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat11Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText9 .class, SecurityIdentification20 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.044.002.06";

    public MxSeev04400206() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04400206(final String xml) {
        this();
        MxSeev04400206 tmp = parse(xml);
        corpActnMvmntPrlimryAdvcCxlAdvc = tmp.getCorpActnMvmntPrlimryAdvcCxlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04400206(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntPrlimryAdvcCxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 getCorpActnMvmntPrlimryAdvcCxlAdvc() {
        return corpActnMvmntPrlimryAdvcCxlAdvc;
    }

    /**
     * Sets the value of the corpActnMvmntPrlimryAdvcCxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 }
     *     
     */
    public MxSeev04400206 setCorpActnMvmntPrlimryAdvcCxlAdvc(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V06 value) {
        this.corpActnMvmntPrlimryAdvcCxlAdvc = value;
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
    public static MxSeev04400206 parse(String xml) {
        return ((MxSeev04400206) MxReadImpl.parse(MxSeev04400206 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04400206 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04400206) parserImpl.read(MxSeev04400206 .class, xml, _classes));
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
     * Creates an MxSeev04400206 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04400206 message
     * @return
     *     a new instance of MxSeev04400206
     */
    public final static MxSeev04400206 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04400206 .class);
    }

}
