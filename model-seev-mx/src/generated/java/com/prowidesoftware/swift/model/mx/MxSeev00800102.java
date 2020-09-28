
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.008.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgRsltDssmntn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.008.001.02")
public class MxSeev00800102
    extends AbstractMX
{

    @XmlElement(name = "MtgRsltDssmntn", required = true)
    protected MeetingResultDisseminationV02 mtgRsltDssmntn;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AlternateFinancialInstrumentIdentification1 .class, AmendInformation2 .class, CommunicationAddress4 .class, CurrencyAndAmount.class, EligiblePosition2 .class, GenericIdentification1 .class, GenericIdentification5 .class, HoldingBalance3 .class, MeetingReference3 .class, MeetingResultDisseminationV02 .class, MeetingType2Code.class, MeetingTypeClassification1Code.class, MessageIdentification.class, MessageIdentification1 .class, MxSeev00800102 .class, NameAndAddress5 .class, Participation2 .class, PartyIdentification3 .class, PartyIdentification9Choice.class, PostalAddress1 .class, SafekeepingPlace1Code.class, SafekeepingPlaceAsCodeAndPartyIdentification.class, SafekeepingPlaceFormatChoice.class, SecuritiesEntryType2Code.class, SecurityIdentification3 .class, SecurityPosition5 .class, UnitOrFaceAmountChoice.class, Vote5 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.008.001.02";

    public MxSeev00800102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00800102(final String xml) {
        this();
        MxSeev00800102 tmp = parse(xml);
        mtgRsltDssmntn = tmp.getMtgRsltDssmntn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00800102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgRsltDssmntn property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingResultDisseminationV02 }
     *     
     */
    public MeetingResultDisseminationV02 getMtgRsltDssmntn() {
        return mtgRsltDssmntn;
    }

    /**
     * Sets the value of the mtgRsltDssmntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingResultDisseminationV02 }
     *     
     */
    public MxSeev00800102 setMtgRsltDssmntn(MeetingResultDisseminationV02 value) {
        this.mtgRsltDssmntn = value;
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
    public static MxSeev00800102 parse(String xml) {
        return ((MxSeev00800102) MxReadImpl.parse(MxSeev00800102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00800102 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00800102) parserImpl.read(MxSeev00800102 .class, xml, _classes));
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
     * Creates an MxSeev00800102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00800102 message
     * @return
     *     a new instance of MxSeev00800102
     */
    public final static MxSeev00800102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev00800102 .class);
    }

}
